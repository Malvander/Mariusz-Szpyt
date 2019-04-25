package com.bestbuyapitest.autotest;

import feign.FeignException;
import io.swagger.client.ApiClient;
import io.swagger.client.api.StoresApi;
import io.swagger.client.model.Service;
import io.swagger.client.model.Store;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * API tests for StoresApi
 */
@Slf4j()
@SpringBootTest
public class StoresApiTest extends AbstractTestNGSpringContextTests {

    private StoresApi api;

    @BeforeClass
    public void setup() {
        api = new ApiClient().buildClient(StoresApi.class);
    }

    @Test
    public void findStoreByIdTest() {
        Long id = new Long(4);

        Store response = api.findStoreById(id);
        log.info("got response: " + response.toString());

        Assert.assertEquals(response.getName(),"Minnetonka");
        Assert.assertEquals(response.getType(), "BigBox");
        Assert.assertEquals(response.getAddress(),"13513 Ridgedale Dr");

    }

    @Test
    public void findStoreByIdTestNegative() {

        Long id = new Long(8222);
        try{
            api.findStoreById(id);
            Assert.fail("Expected 404 Not Found");
        }catch (FeignException E){
            Assert.assertEquals(E.status(), 404);
        }

    }


    @Test(dependsOnMethods = {"findStoreByIdTest"})
    public void updateStoreByIdTest() {
        Long id = new Long(4);
        String oldName = api.findStoreById(id).getName();
        String newName = "ChangedStore";
        Store store = provideTestStore(newName);
        Store response = api.updateStoreById(id, store);

        Assert.assertEquals(api.findStoreById(id).getName(),newName);

        api.updateStoreById(id, provideTestStore(oldName));
    }

    @Test
    public void findStoresTest() {

        String storeName = "Minnetonka";

        StoresApi.FindStoresQueryParams queryParams = new StoresApi.FindStoresQueryParams();
        queryParams.put("name",storeName);

        List<Store> response = api.findStores(queryParams);

        Assert.assertEquals(response.size(),1);
        Assert.assertEquals(response.get(0).getName(),storeName);
    }

    @Test(dependsOnMethods = {"findStoresTest"})
    public void addStoreTest() {
        String storeName = "TestStore1";

        api.addStore(provideTestStore(storeName));

        StoresApi.FindStoresQueryParams queryParams = new StoresApi.FindStoresQueryParams();
        queryParams.put("name",storeName);

        Assert.assertEquals(api.findStores(queryParams).size(),1);
        Assert.assertEquals(api.findStores(queryParams).get(0).getName(),storeName);
    }

    @Test(enabled = false)
    public void deletestoreTest() {

        // Waiting for way to retrieve store id

    }

    @Test
    public void deletestoreTestNegative() {

        Long id = new Long(8222);
        try{
            api.deletestore(id);
            Assert.fail("Expected 404 Not Found");
        }catch (FeignException E){
            Assert.assertEquals(E.status(), 404);
        }

    }

    public Store provideTestStore(String name){

        Service testService = new Service();
        testService.setName("TestServiceName");

        Store testStore = new Store();
        testStore.setName(name);
        testStore.setAddress("TestAddress1");
        testStore.setAddress2("TestAddress2");
        testStore.setCity("TestCity1");
        testStore.setState("TestState1");
        testStore.setZip("TestZip1");
        testStore.setLat(new BigDecimal(11.11111));
        testStore.setLng(new BigDecimal(11.11111));
        testStore.setHours("11-20");
        testStore.setType("TestType");
        testStore.setServices(testService);


        return testStore;
    }
    
}

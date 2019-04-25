# Monefy app test plan

This document is a test plan for free-version of Monefy Android App.

## Application description & features

Monefy is a money management app where you can add your expenses in a dedicated category and track your spendings. 

### Google Play app description

How to track your expenses successfully? We know that it’s easy. You only need to add each expense you do… no more than that! And Monefy is going to help you. Just add new records when you are buying a coffee or taking a taxi. It’s done in one click, because you don’t need to fill anything except the amount. It has never been so quick and enjoyable!

[See full description here](https://www.google.com)

### Website app description
* see your spendings distribution on the chart or get detailed information from the transactions list
* manage categories, if defaults do not work for you
* be safely synchronized using your own Google Drive or Dropbox account
* handy widgets that could be used on lock screen
* multi-currency support
* select the currency
* use budget mode
* backup and export data in one click
* multiple accounts support
* passcode, Touch ID and Face ID protection
* built-in calculator
* dark theme

[See full description here](http://www.monefy.me)

### Free app features
0. Finance tracking
    0. expenses
    0. incomes
    0. transfers  
0. Finance overview 
    0. totals
    0. charts
    0. lists
0. Finance time-wise breakdown
    0. day
    0. week
    0. month
    0. year
    0. all-time
0. Finance payment-wise breakdown
    0. cash
    0. accounts
    0. all
0. Budget mode
0. Carry-over option
0. Built-in calculator
0. Multiple accounts support
0. Main currency selection
0. Cloud sync
    0. Google drive
    0. Dropbox
0. Screen widgets
0. Data backup
0. Data file export
0. Multiple language support
0. Customizable first day of the week
0. Customizable first day of the month
0. Smartphone / Tablet support

## Test Cases

List of cases divided by categories. Cases should be conducted both on smartphone and tablet.

### Functional
#### Finance tracking
##### expenses
0. Add expense
0. Remove expense
0. Edit expense
##### incomes
0. Add income
0. Remove income
0. Edit income
##### transfers
0. Add transfer
0. Remove transfer
0. Edit transfer

#### Finance overview
##### totals
###### Carryover Off, Budget Off
0. Verify totals using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown.
0. Verify totals using provided data (income and expense values similar) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify totals using provided data (income and expense values highly differentiated) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify totals using provided data (income and expense values with one dominating value) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify totals using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the week.
0. Verify totals using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the month.

###### Carryover On, Budget Off
0. Verify totals using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown.
0. Verify totals using provided data (income and expense values similar) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify totals using provided data (income and expense values highly differentiated) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify totals using provided data (income and expense values with one dominating value) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify totals using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the week.
0. Verify totals using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the month.

###### Carryover Off, Budget On
0. Verify totals using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown.
0. Verify totals using provided data (income and expense values similar) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify totals using provided data (income and expense values highly differentiated) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify totals using provided data (income and expense values with one dominating value) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify totals using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the week.
0. Verify totals using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the month.

###### Carryover On, Budget On
0. Verify totals using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown.
0. Verify totals using provided data (income and expense values similar) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify totals using provided data (income and expense values highly differentiated) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify totals using provided data (income and expense values with one dominating value) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify totals using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the week.
0. Verify totals using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the month.

##### charts
###### Carryover Off, Budget Off
0. Verify charts using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown.
0. Verify charts using provided data (income and expense values similar) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify charts using provided data (income and expense values highly differentiated) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify charts using provided data (income and expense values with one dominating value) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify charts using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the week.
0. Verify charts using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the month.

###### Carryover On, Budget Off
0. Verify charts using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown.
0. Verify charts using provided data (income and expense values similar) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify charts using provided data (income and expense values highly differentiated) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify charts using provided data (income and expense values with one dominating value) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify charts using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the week.
0. Verify charts using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the month.

###### Carryover Off, Budget On
0. Verify charts using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown.
0. Verify charts using provided data (income and expense values similar) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify charts using provided data (income and expense values highly differentiated) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify charts using provided data (income and expense values with one dominating value) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify charts using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the week.
0. Verify charts using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the month.

###### Carryover On, Budget On
0. Verify charts using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown.
0. Verify charts using provided data (income and expense values similar) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify charts using provided data (income and expense values highly differentiated) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify charts using provided data (income and expense values with one dominating value) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify charts using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the week.
0. Verify charts using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the month.

##### lists
###### Carryover Off, Budget Off
0. Verify lists using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown.
0. Verify lists using provided data (income and expense values similar) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify lists using provided data (income and expense values highly differentiated) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify lists using provided data (income and expense values with one dominating value) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify lists using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the week.
0. Verify lists using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the month.

###### Carryover On, Budget Off
0. Verify lists using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown.
0. Verify lists using provided data (income and expense values similar) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify lists using provided data (income and expense values highly differentiated) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify lists using provided data (income and expense values with one dominating value) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify lists using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the week.
0. Verify lists using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the month.

###### Carryover Off, Budget On
0. Verify lists using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown.
0. Verify lists using provided data (income and expense values similar) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify lists using provided data (income and expense values highly differentiated) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify lists using provided data (income and expense values with one dominating value) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify lists using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the week.
0. Verify lists using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the month.

###### Carryover On, Budget On
0. Verify lists using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown.
0. Verify lists using provided data (income and expense values similar) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify lists using provided data (income and expense values highly differentiated) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify lists using provided data (income and expense values with one dominating value) Check time-wise breakdown. Check payment-wise breakdown.
0. Verify lists using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the week.
0. Verify lists using provided data (income and expense values random). Check time-wise breakdown. Check payment-wise breakdown. Change first day of the month.

#### Built-in calculator

0. Verify that all the buttons are present and text written on them is readable.
0. Check the arithmetic operations are working fine +, -, /, *.
0. Check the arithmetic operations are working fine with negative numbers.
0. Check the arithmetic operations are working fine with zero.
0. Verify that calculator gives correct result in case of operations containing decimal numbers.
0. Verify the number of digits allowed to enter in the calculator for any operation.
0. Verify the limit of the response value.
0. Verify that on pressing two operators one after the other, the latest one will override the previous operator.
0. Verify if user can delete a digits one by one using backspace key.

#### Multiple accounts support
0. Add account.
0. Remove account.
0. Edit account.
0. Add many accounts.
0. Verify expenses after account removal.
0. Verify incomes after account removal.
0. Verify transfers after account removal.

#### Main currency selection
0. Switch main currency to each of available currencies.

#### Multiple language support
0. Switch language to each of available languages.

#### Cloud sync
##### Google Drive
0. Change data of same user account on different devices.
0. Change data of same user account on different devices in parallel.
0. Change data of same user account on different devices in parallel. Delete data being worked on by different device.
0. Clear app memory from device settings.

##### Dropbox
0. Change data of same user account on different devices.
0. Change data of same user account on different devices in parallel.
0. Change data of same user account on different devices in parallel. Delete data being worked on by different device.
0. Clear app memory from device settings.

#### Screen widgets
0. Check small widget. Verify data. Add new data from widget.
0. Check big widget. Verify data. Add new data from widget.

#### Data backup
0. Perform data backup.
0. Perform data restoration.
0. Clear app memory from device settings.

#### Data file export
0. export data to file and verify using provided pre-loaded data.

### Non-functional
#### Interruption checks
0. Incoming SMS
0. Notification from another app
0. Cable insertion or removal
0. Low battery notification
0. Incoming call.
0. During call.

#### Installation
0. Application can be installed successfully following normal installation procedures.
0. Check uninstallation.
0. Check reinstallation.

#### Performance
0. Verify CPU usage.
0. Verify memory usage.
0. Verify battery drain.
0. Verify on-device memory utilization.
0. App performance when memory is full.
0. App performance when on-device memory is full.
0. App performance when CPU is heavy loaded.

## Test set-up
This section describes test organisation and set-up. *Won't be filling this section, just wanted to have it as hint this would be needed*
### App
*Version, where to get it, etc.*
### Devices
*List, how to get those.*
### Data
*Data needed to use during testing*

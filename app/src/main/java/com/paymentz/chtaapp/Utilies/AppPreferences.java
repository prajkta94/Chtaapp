package com.paymentz.chtaapp.Utilies;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Vinicius on 9/13/2016.
 */
public class AppPreferences {

    private static final String PREFERENCES_FILE = "preferences";

    private static final String USER_ID = "USER_ID";
    private static final String EMAIL_ID = "EMAIL_ID";
    private static final String USER_NAME = "USER_NAME";
    private static final String USER_PIN_CODE = "USER_PIN_CODE";
    private static final String USER_CITY = "USER_CITY";
    private static final String USER_STATE = "USER_STATE";
    private static final String USER_MOBILE_NUMBER = "USER_MOBILE_NUMBER";
    private static final String USER_AMOUNT = "USER_AMOUNT";
    private static final String TW_COIN = "TW_COIN";
    private static final String USER_PASSWORD = "USER_PASSWORD";
    private static final String NUMBER_OF_REQUESTS = "NUMBER_OF_REQUESTS";
    private static final String DATE_OF_BIRTH = "DATE_OF_BIRTH";
    private static final String GENDER = "GENDER";
    private static final String PROFILE_PIC_URL = "PROFILE_PIC_URL";
    private static final String LANGUAGE_PREFERENCE = "LANGUAGE_PREFERENCE";
    private static final String CURRENT_LANGUAGE = "CURRENT_LANGUAGE";
    private static final String LANGUAGE_KEY_PREFERENCE = "LANGUAGE_KEY_PREFERENCE";

    private static final String USER_QR_CODE_URL = "USER_QR_CODE_URL";
    private static final String USER_LOYALTY_POINTS = "USER_LOYALTY_POINTS";
    private static final String ACCOUNT_TYPE = "ACCOUNT_TYPE";
    private static final String SUB_ROLE = "SUB_ROLE";
    private static final String PREPAIDCARD_CURRENCY = "PREPAIDCARD_CURRENCY";

    private static final String IS_DEALS_USED = "IS_DEALS_USED";
    private static final String IS_FRAUD_CHECK_ALLOWED = "IS_FRAUD_CHECK_ALLOWED";
    private static final String IS_FINGERPRINT_ENABLED = "IS_FINGERPRINT_ENABLED";
    private static final String ALLOW_CUSTOMER_TO_ACTIVATE_CARD = "ALLOW_CUSTOMER_TO_ACTIVATE_CARD";
    private static final String IS_PREPAID_CARD_FEATURE_REQUIRED = "IS_PREPAID_CARD_FEATURE_REQUIRED";
    private static final String IS_DEALS_WANTS = "IS_DEALS_WANTS";
    private static final String CUST_CURRENCY = "CUST_CURRENCY";
    private static final String SEC_KEY = "SEC_KEY";
    private static final String VENDOR_WEBSITE = "VENDOR_WEBSITE";
    private static final String VENDOR_ADDRESS = "VENDOR_ADDRESS";
    private static final String VENDOR_COUNTRY = "VENDOR_COUNTRY";
    private static final String GCM_DEVICE_TOKEN = "GCM_DEVICE_TOKEN";
    private static final String CUSTOMER_ADDRESS_TYPE = "CUSTOMER_ADDRESS_TYPE";
    private static final String CUSTOMER_ADDRESS_NAME = "CUSTOMER_ADDRESS_NAME";
    private static final String CUSTOMER_ADDRESS_PHONE = "CUSTOMER_ADDRESS_PHONE";
    private static final String CUSTOMER_ADDRESS_PINCODE = "CUSTOMER_ADDRESS_PINCODE";
    private static final String CUSTOMER_ADDRESS_CITY = "CUSTOMER_ADDRESS_CITY";
    private static final String CUSTOMER_ADDRESS_STATE = "CUSTOMER_ADDRESS_STATE";
    private static final String CUSTOMER_ADDRESS_COUNTRY = "CUSTOMER_ADDRESS_COUNTRY";
    private static final String CUSTOMER_ADDRESS = "CUSTOMER_ADDRESS";
    private static final String CUSTOMER_ADDRESS_LANDMARK = "CUSTOMER_ADDRESS_LANDMARK";
    private static final String CUSTOMER_ADDRESS_ALTERNATE_PHONE = "CUSTOMER_ADDRESS_ALTERNATE_PHONE";
    private static final String COUNTRY_CODE = "COUNTRY_CODE";
    private static final String MERCHANT_USER_NAME = "MERCHANT_USER_NAME";
    private static final String TO_ID = "TO_ID";
    private static final String PARTNER_ID = "PARTNER_ID";
    private static final String TO_TYPE = "TO_TYPE";
    private static final String REDIRECT_URL = "REDIRECT_URL";
    private static final String LANGUAGE = "LANGUAGE";
    private static final String TERMINAL_ID = "TERMINAL_ID";
    private static final String MERCHANT_PWD = "MERCHANT_PWD";
    private static final String AUTHTOKEN = "AUTHTOKEN";
    private static final String MERCHANT_SEC_KEY = "MERCHANT_SEC_KEY";
    private static final String PAYMENT_TYPE = "PAYMENT_TYPE";
    private static final String PAYMENT_BRAND = "PAYMENT_BRAND";
    private static final String PAYMENT_MODE = "PAYMENT_MODE";
    private static final String TRANSACTION_URL = "TRANSACTION_URL";
    private static final String IS_SEND_MONEY_MERCHANT = "IS_SEND_MONEY_MERCHANT";
    private static final String KYC_ACCOUNT_TYPE = "KYC_ACCOUNT_TYPE";
    private static final String IS_RADIO_ALLOWED = "IS_RADIO_ALLOWED";
    private static final String IS_RECHARGE_ALLOWED = "IS_RECHARGE_ALLOWED";
    private static final String IS_BLOCKCHAIN_ALLOWED = "IS_BLOCKCHAIN_ALLOWED";
    private static final String IS_MYCARD_ALLOWED = "IS_MYCARD_ALLOWED";
    private static final String IS_LOADMONEY_ALLOWED = "IS_LOADMONEY_ALLOWED";
    private static final String IS_PAY_ALLOWED = "IS_PAY_ALLOWED";
    private static final String IS_CUST_SELECT_PAY_OPTION = "IS_CUST_SELECT_PAY_OPTION";
    private static final String IS_WITHDRAWMONEY_ALLOWED = "IS_WITHDRAW_ALLOWED";
    private static final String IS_SENDMONEY_ALLOWED = "IS_SENDMONEY_ALLOWED";
    private static final String IS_REQUESTMONEY_ALLOWED = "IS_REQUESTMONEY_ALLOWED";
    private static final String IS_ACTIVITYLOG_ALLOWED = "IS_ACTIVITYLOG_ALLOWED";
    private static final String IS_MYWALLET_ALLOWED = "IS_MYWALLET_ALLOWED";
    private static final String IS_LOYALTYPOINTS_ALLOWED = "IS_LOYALTYPOINTS_ALLOWED";
    private static final String IS_DONATION_ALLOWED = "IS_DONATION_ALLOWED";
    private static final String IS_BILL_PAYMENT = "IS_BILL_PAYMENT";
    private static final String IS_PAY_RECEIVED = "IS_PAY_RECEIVED";
    private static final String IS_PAY_ORDER = "IS_PAY_ORDER";
    private static final String IS_CHEQUE_DEPOSIT = "IS_CHEQUE_DEPOSIT";
    private static final String IS_CASH_IN = "IS_CASH_IN";
    private static final String IS_REQUEST_CASH_IN = "IS_REQUEST_CASH_IN";
    private static final String IS_WALLET_HISTORY = "IS_WALLET_HISTORY";
    private static final String IS_PROFILE_SETTING = "IS_PROFILE_SETTING";
    private static final String IS_USER_MANAGEMENT = "IS_USER_MANAGEMENT";
    private static final String IS_STORE_REQUIRED = "IS_STORE_REQUIRED";


    private static final String IS_TRANSACTION_HISTORY = "IS_TRANSACTION_HISTORY";
    private static final String IS_CUST_CREATION_ALLOWED = "IS_CUST_CREATION_ALLOWED";

    private static final String IBAN = "IBAN";
    private static final String FEE_ACCOUNT = "FEE_ACCOUNT";
    private static final String BALANCE = "BALANCE";
    private static final String NAME = "NAME";
    private static final String DASHBOARD_SEND_MONEY = "DASHBOARD_SEND_MONEY";
    private static final String DASHBOARD_MY_WALLET = "DASHBOARD_MY_WALLET";
    private static final String IS_LOAD_AMOUNT_PAGE_ALLOWED = "IS_LOAD_AMOUNT_PAGE_ALLOWED";
    private static final String IS_EMAIL_VERIFIED = "IS_EMAIL_VERIFIED";
    private static final String IS_MOBILE_VERIFIED = "IS_MOBILE_VERIFIED";
    private static final String IS_MOBILE_CHECKED_MANDATORY = "IS_MOBILE_CHECKED_MANDATORY";
    private static final String IS_EMAIL_CHECKED_MANDATORY = "IS_EMAIL_CHECKED_MANDATORY";
    /*private static final String DEFAULT_CURRENCYLIST = "DEFAULT_CURRENCYLIST";
    private static final String AMOUNT_DETAIL_CURRENCYLIST = "AMOUNT_DETAIL_CURRENCYLIST";
    private static final String WALLETS_NAMES_LIST = "WALLETS_NAMES_LIST";
    private static final String CURRENCYLIST = "CURRENCYLIST";*/

    private static final String ALL_CURRENCY_LIST = "ALL_CURRENCY_LIST";
    private static final String LOCK_SCREEN_WALLET = "LOCK_SCREEN_WALLET";
    private static final String USER_AUTHENTICATED = "USER_AUTHENTICATED";
    private static final String CONFIRM_PASSWORD = "CONFIRM_PASSWORD";
    private static final String CONFIRM_PASSWORD_VERIFIED = "CONFIRM_PASSWORD_VERIFIED";

    private static final String DEFAULT_LOCK_SCREEN_WALLET = "DEFAULT_LOCK_SCREEN_WALLET";
    private static final String IS_CASHOUT = "IS_CASHOUT";
    //For Decimal Finance
    private static final String UPI_ID = "UPI_ID";
    private static final String EXIST_PIN = "EXIST_PIN";
    private static final String SET_PIN = "SET_PIN";

    private static final String LOCK_SCREEN = "LOCK_SCREEN";
    private static final String DEFAULT_LOCK_SCREEN = "DEFAULT_LOCK_SCREEN";
    private static final String SESSION_TIMEOUT = "SESSION_TIMEOUT";
    private static final String COUNTER = "COUNTER";


    // Keys for server synchronization
    private static final String LAST_ACTIVITY_LOG_ID = "LAST_ACTIVITY_LOG_ID";
    private static final String LAST_TRANSACTION_HISTORY_ID = "LAST_TRANSACTION_HISTORY_ID";
    private static final String LAST_PASSBOOK_TRANSACTION_ID = "LAST_PASSBOOK_TRANSACTION_ID";
    private static final String IS_WALLET_TRANSFER_ALLOWED = "IS_WALLET_TRANSFER_ALLOWED";
    private static final String IS_LOAD_WITH_WALLET_ALLOWED = "IS_LOAD_WITH_WALLET_ALLOWED";
    private static final String LOAD_INTEGRATION_TYPE = "LOAD_INTEGRATION_TYPE";
    private static final String IS_MY_BANK_ALLOWED = "IS_MY_BANK_ALLOWED";


    //security
    private static final String PATTERN_VALUE = "PATTERN_VALUE";


    //TransactionHistory List

    private static final String TRANSACTION_HISTORY = "TRANSACTION_HISTORY";
    private static final String IS_DATA_LOADED = "IS_DATA_LOADED";
    private static final String SELECTED_CURRENCY = "SELECTED_CURRENCY";
    private static final String PASSBOOK_LIST = "PASSBOOK_LIST";

    private static final String LOCAl_LANGUAGE = "LOCAl_LANGUAGE";
    private static final String IS_APP_REOPEN = "IS_APP_REOPEN";
    private static final String IS_SMS_OTP = "IS_SMS_OTP";
    private static final String IS_SMS_OTP_FOR_SIGNUP = "IS_SMS_OTP_FOR_SIGNUP";


    //Screensize

    private static final String SCREENHEIGHT = "SCREENHEIGHT";
    private static final String SCREENWIDTH = "SCREENWIDTH";
    private static final String SENDPINALLOWED = "SENDPINALLOWED";
    private static final String REQUESTPINALLOWED = "REQUESTPINALLOWED";
    private static final String LOADPINALLOWED = "LOADPINALLOWED";
    private static final String WITHDRAWPINALLOWED = "WITHDRAWPINALLOWED";
    private static final String PAYPINALLOWED = "PAYPINALLOWED";
    private static final String CHECKOUTPINALLOWED = "CHECKOUTPINALLOWED";
    private static final String PAYORDERPINALLOWED = "PAYORDERPINALLOWED";
    private static final String PURCHASEPINALLOWED = "PURCHASEPINALLOWED";
    private static final String ENTITYTYPE = "ENTITYTYPE";
    private static final String COMPANY_DETAILS = "COMPANY_DETAILS";
    private static final String BUSINESS_DETAILS = "BUSINESS_DETAILS";
    private static final String CUST_OPTION = "CUST_OPTION";
    private static final String DEALER_ID = "DEALER_ID";
    private static final String DEALER_CUST_ID = "DEALER_CUST_ID";
    private static final String DSR_ID = "DSR_ID";
    private static final String DSR_NAME = "DSR_NAME";
    private static final String IS_USER_LOGGEDIN = "IS_USER_LOGGEDIN";
    private static final String CASHIN = "CASHIN";

    private static final String IS_REQUEST_CASHOUT_ALLOWED = "IS_REQUEST_CASHOUT_ALLOWED";

    //OpenBanking
    private static final String IS_TO_CONTACT = "IS_TO_CONTACT";
    private static final String IS_SEND_TO_SELF = "SEND_TO_SELF";
    private static final String IS_CHECK_BALANCE = "CHECK_BALANCE";
    private static final String IS_MANAGE_BENEFICIARY = "MANAGE_BENEFICIARY";
    private static final String IS_SEND_SELF_BANK_TRANSFER = "IS_SEND_SELF_BANK_TRANSFER";


    //setNAd set not preparde


    // Market Place Flag
    private static final String IS_ORDERMANAGEMENT = "IS_ORDERMANAGEMENT";
    private static final String IS_PRODUCTMANAGEMENT = "IS_PRODUCTMANAGEMENT";
    private static final String IS_ORDERSELLREPORT = "IS_ORDERSELLREPORT";
    private static final String IS_PROMOCODE = "IS_PROMOCODE";
    private static final String SUPPORT_EMAIL = "SUPPORT_EMAIL";
    private static final String SUPPORT_MOBILE = "SUPPORT_MOBILE";
    private static final String SUPPORT_FAQ_URL = "SUPPORT_FAQ_URL";

    private static final String SELECTED_STORE_ID = "SELECTED_STORE_ID";
    private static final String SELECTED_WALLET_ID = "SELECTED_WALLET_ID";
    private static final String DEFAULT_AMOUNT_CURRENCY = "DEFAULT_AMOUNT_CURRENCY";
    private static final String STOREMAP = "STOREMAP";
    private static final String WALLETMAP = "WALLETMAP";
    private static final String SELECTEDWALLET = "SELECTEDWALLET";
    private static final String SELECTEDSTORE = "SELECTEDSTORE";



//    private static final String


    //Login User Auth
    private static AppPreferences sInstance;
    private SharedPreferences mPreferences;


    public static synchronized AppPreferences getInstance(Context context) {

        if (sInstance == null) {
            sInstance = new AppPreferences(context);
        }

        return sInstance;
    }

    private AppPreferences(Context context) {
        mPreferences = context.getSharedPreferences(PREFERENCES_FILE, Context.MODE_PRIVATE);
    }

    public String getCustomerAddressType() {
        return mPreferences.getString(CUSTOMER_ADDRESS_TYPE, "");
    }

    public String getCustomerAddressAlternatePhone() {
        return mPreferences.getString(CUSTOMER_ADDRESS_ALTERNATE_PHONE, "");
    }

    public String getCountryCode() {
        return mPreferences.getString(COUNTRY_CODE, "");
    }

    public String getMerchantUserName() {
        return mPreferences.getString(MERCHANT_USER_NAME, "");
    }

    public String getToId() {
        return mPreferences.getString(TO_ID, "");
    }

    public String getPartnerId() {
        return mPreferences.getString(PARTNER_ID, "");
    }

    public String getToType() {
        return mPreferences.getString(TO_TYPE, "");
    }

    public String getRedirectUrl() {
        return mPreferences.getString(REDIRECT_URL, "");
    }

    public String getLanguage() {
        return mPreferences.getString(LANGUAGE, "");
    }

    public String getTerminalId() {
        return mPreferences.getString(TERMINAL_ID, "");
    }

    public String getKycAccountType() {
        return mPreferences.getString(KYC_ACCOUNT_TYPE, "");
    }

    public String getMerchantPwd() {
        return mPreferences.getString(MERCHANT_PWD, "");
    }

    public String getAuthtoken() {
        return mPreferences.getString(AUTHTOKEN, "");
    }

    public String getMerchantSecKey() {
        return mPreferences.getString(MERCHANT_SEC_KEY, "");
    }

    public String getPaymentType() {
        return mPreferences.getString(PAYMENT_TYPE, "");
    }

    public String getSupportFaqUrl() {
        return mPreferences.getString(SUPPORT_FAQ_URL, "");
    }

    public String getPaymentBrand() {
        return mPreferences.getString(PAYMENT_BRAND, "");
    }

    public String getPaymentMode() {
        return mPreferences.getString(PAYMENT_MODE, "");
    }

    public String getTransactionUrl() {
        return mPreferences.getString(TRANSACTION_URL, "");
    }

    public String getCustomerAddressLandmark() {
        return mPreferences.getString(CUSTOMER_ADDRESS_LANDMARK, "");
    }

    public String getCustomerAddress() {
        return mPreferences.getString(CUSTOMER_ADDRESS, "");
    }

    public String getCustOption() {
        return mPreferences.getString(CUST_OPTION, "N");
    }

    public String getCustomerAddressCountry() {
        return mPreferences.getString(CUSTOMER_ADDRESS_COUNTRY, "");
    }

    public int getScreenheight() {
        return mPreferences.getInt(SCREENHEIGHT, 0);
    }

    public int getScreenwidth() {
        return mPreferences.getInt(SCREENWIDTH, 0);
    }

    public String getCustomerAddressCity() {
        return mPreferences.getString(CUSTOMER_ADDRESS_CITY, "");
    }

    public String getCustomerAddressState() {
        return mPreferences.getString(CUSTOMER_ADDRESS_STATE, "");
    }

    public String getCustomerAddressPincode() {
        return mPreferences.getString(CUSTOMER_ADDRESS_PINCODE, "");
    }

    public String getCustomerAddressPhone() {
        return mPreferences.getString(CUSTOMER_ADDRESS_PHONE, "");
    }

    public String getAllCurrencyList() {
        return mPreferences.getString(ALL_CURRENCY_LIST, "");
    }

    public String getIsDataLoaded() {
        return mPreferences.getString(IS_DATA_LOADED, "");
    }

    public String getPassbookList() {
        return mPreferences.getString(PASSBOOK_LIST, "");
    }

    public String getCustomerAddressName() {
        return mPreferences.getString(CUSTOMER_ADDRESS_NAME, "");
    }

    public String getIban() {
        return mPreferences.getString(IBAN, "");
    }

    public String getFeeAccount() {
        return mPreferences.getString(FEE_ACCOUNT, "");
    }

    public String getName() {
        return mPreferences.getString(NAME, "");
    }

    public String getSelectedCurrency() {
        return mPreferences.getString(SELECTED_CURRENCY, "");
    }

    public String getUpiId() {
        return mPreferences.getString(UPI_ID, "");
    }

    public void setCustomerAddressType(String customerAddressType) {
        mPreferences.edit().putString(CUSTOMER_ADDRESS_TYPE, customerAddressType).apply();
    }

    public void setCustOption(String custOption) {
        mPreferences.edit().putString(CUST_OPTION, custOption).apply();
    }


    public void setDealerId(String dealerId) {
        mPreferences.edit().putString(DEALER_ID, dealerId).apply();
    }

    public String getDealerId() {
        return mPreferences.getString(DEALER_ID, "");
    }


    public void setIsRequestCashoutAllowed(String isRequestCashoutAllowed) {
        mPreferences.edit().putString(IS_REQUEST_CASHOUT_ALLOWED, isRequestCashoutAllowed).apply();
    }

    public String getIsRequestCashoutAllowed() {
        return mPreferences.getString(IS_REQUEST_CASHOUT_ALLOWED, "N");
    }

    public void setDealerCustId(String dealerCustId) {
        mPreferences.edit().putString(DEALER_CUST_ID, dealerCustId).apply();
    }


    public void setIsToContact(String isToContact) {
        mPreferences.edit().putString(IS_TO_CONTACT, isToContact).apply();
    }

    public String getIsToContact() {
        return mPreferences.getString(IS_TO_CONTACT, "Y");
    }

    public void setIsSendToSelf(String isendToSelf) {
        mPreferences.edit().putString(IS_SEND_TO_SELF, isendToSelf).apply();
    }

    public String getIsSendToSelf() {
        return mPreferences.getString(IS_SEND_TO_SELF, "Y");
    }


    public void setIsManageBeneficiary(String isManageBeneficiary) {
        mPreferences.edit().putString(IS_MANAGE_BENEFICIARY, isManageBeneficiary).apply();
    }

    public String getIsManageBeneficiary() {
        return mPreferences.getString(IS_MANAGE_BENEFICIARY, "Y");
    }

    public void setIsCheckBalance(String isToContact) {
        mPreferences.edit().putString(IS_CHECK_BALANCE, isToContact).apply();
    }

    public String getIsCheckBalance() {
        return mPreferences.getString(IS_CHECK_BALANCE, "Y");
    }

    public void setIsSendSelfBankTransfer(String isSendSelfBankTransfer) {
        mPreferences.edit().putString(IS_SEND_SELF_BANK_TRANSFER, isSendSelfBankTransfer).apply();
    }

    public String getIsSendSelfBankTransfer() {
        return mPreferences.getString(IS_SEND_SELF_BANK_TRANSFER, "Y");
    }


    public String getDealerCustId() {
        return mPreferences.getString(DEALER_CUST_ID, "");
    }


    public void setDsrId(String dsrId) {
        mPreferences.edit().putString(DSR_ID, dsrId).apply();
    }

    public String getDsrId() {
        return mPreferences.getString(DSR_ID, "");
    }


    public void setDsrName(String dsrName) {
        mPreferences.edit().putString(DSR_NAME, dsrName).apply();
    }

    public String getDsrName() {
        return mPreferences.getString(DSR_NAME, "");
    }


    public void setCustomerAddressAlternatePhone(String customerAddressAlternatePhone) {
        mPreferences.edit().putString(CUSTOMER_ADDRESS_ALTERNATE_PHONE, customerAddressAlternatePhone).apply();
    }

    public void setCountryCode(String countryCode) {
        mPreferences.edit().putString(COUNTRY_CODE, countryCode).apply();
    }

    public void setMerchantUserName(String merchantUserName) {
        mPreferences.edit().putString(MERCHANT_USER_NAME, merchantUserName).apply();
    }

    public void setToId(String toId) {
        mPreferences.edit().putString(TO_ID, toId).apply();
    }

    public void setPartnerId(String partnerId) {
        mPreferences.edit().putString(PARTNER_ID, partnerId).apply();
    }

    public void setToType(String toType) {
        mPreferences.edit().putString(TO_TYPE, toType).apply();
    }

    public void setRedirectUrl(String redirectUrl) {
        mPreferences.edit().putString(REDIRECT_URL, redirectUrl).apply();
    }

    public void setLanguage(String language) {
        mPreferences.edit().putString(LANGUAGE, language).apply();
    }

    public void setPassbookList(String text) {
        mPreferences.edit().putString(PASSBOOK_LIST, text).apply();
    }

    public void setTerminalId(String terminalId) {
        mPreferences.edit().putString(TERMINAL_ID, terminalId).apply();
    }

    public void setIsDataLoaded(String value) {
        mPreferences.edit().putString(IS_DATA_LOADED, value).apply();
    }

    public void setKycAccountType(String kycAccountType) {
        mPreferences.edit().putString(KYC_ACCOUNT_TYPE, kycAccountType).apply();
    }

    public void setMerchantPwd(String merchantPwd) {
        mPreferences.edit().putString(MERCHANT_PWD, merchantPwd).apply();
    }

    public void setAuthtoken(String authtoken) {
        mPreferences.edit().putString(AUTHTOKEN, authtoken).apply();
    }

    public void setMerchantSecKey(String merchantSecKey) {
        mPreferences.edit().putString(MERCHANT_SEC_KEY, merchantSecKey).apply();
    }

    public void setPaymentType(String paymentType) {
        mPreferences.edit().putString(PAYMENT_TYPE, paymentType).apply();
    }

    public void setSupportFaqUrl(String supportFaqUrl) {
        mPreferences.edit().putString(SUPPORT_FAQ_URL, supportFaqUrl).apply();
    }

    public void setPaymentBrand(String paymentBrand) {
        mPreferences.edit().putString(PAYMENT_BRAND, paymentBrand).apply();
    }

    public void setSelectedCurrency(String currency) {
        mPreferences.edit().putString(SELECTED_CURRENCY, currency).apply();
    }

    public void setPaymentMode(String paymentMode) {
        mPreferences.edit().putString(PAYMENT_MODE, paymentMode).apply();
    }

    public void setTransactionUrl(String transactionUrl) {
        mPreferences.edit().putString(TRANSACTION_URL, transactionUrl).apply();
    }

    public void setCustomerAddressLandmark(String customerAddressLandmark) {
        mPreferences.edit().putString(CUSTOMER_ADDRESS_LANDMARK, customerAddressLandmark).apply();
    }

    public void setCustomerAddress(String customerAddress) {
        mPreferences.edit().putString(CUSTOMER_ADDRESS, customerAddress).apply();
    }

    public void setCustomerAddressCountry(String customerAddressCountry) {
        mPreferences.edit().putString(CUSTOMER_ADDRESS_COUNTRY, customerAddressCountry).apply();
    }

    public void setCustomerAddressState(String customerAddressState) {
        mPreferences.edit().putString(CUSTOMER_ADDRESS_STATE, customerAddressState).apply();
    }

    public void setCustomerAddressCity(String customerAddressCity) {
        mPreferences.edit().putString(CUSTOMER_ADDRESS_CITY, customerAddressCity).apply();
    }

    public void setCustomerAddressPincode(String customerAddressPincode) {
        mPreferences.edit().putString(CUSTOMER_ADDRESS_PINCODE, customerAddressPincode).apply();
    }

    public void setCustomerAddressPhone(String customerAddressPhone) {
        mPreferences.edit().putString(CUSTOMER_ADDRESS_PHONE, customerAddressPhone).apply();
    }

    public void setCustomerAddressName(String customerAddressName) {
        mPreferences.edit().putString(CUSTOMER_ADDRESS_NAME, customerAddressName).apply();
    }

    public void setIsCashout(String isCashout) {
        mPreferences.edit().putString(IS_CASHOUT, isCashout).apply();
    }

    public void setScreenheight(int height) {
        mPreferences.edit().putInt(SCREENHEIGHT, height).apply();
    }

    public void setScreenwidth(int width) {
        mPreferences.edit().putInt(SCREENWIDTH, width).apply();
    }

    public String getIsCashout() {
        return mPreferences.getString(IS_CASHOUT, "N");
    }

    /*public void setDefaultCurrencylist(String defaultCurrencylist) {

        mPreferences.edit().putString(DEFAULT_CURRENCYLIST, defaultCurrencylist).apply();

    }
    public void setAmountDetailCurrencylist(String amountDetailCurrencyList) {

        mPreferences.edit().putString(AMOUNT_DETAIL_CURRENCYLIST, amountDetailCurrencyList).apply();

    }
    public void setWalletsNamesList(String walletsNamesList) {

        mPreferences.edit().putString(WALLETS_NAMES_LIST, walletsNamesList).apply();

    }

    public void setCurrencylist(String currencylist) {

        mPreferences.edit().putString(CURRENCYLIST, currencylist).apply();

    }*/

    public void setDefaultAmountCurrency(String defaultAmountCurrency) {
        mPreferences.edit().putString(DEFAULT_AMOUNT_CURRENCY, defaultAmountCurrency).apply();
    }

    public void setSelectedStoreId(String selectedStoreId) {
        mPreferences.edit().putString(SELECTED_STORE_ID, selectedStoreId).apply();
    }

    public void setStoremap(String storemap) {
        mPreferences.edit().putString(STOREMAP, storemap).apply();
    }

    public String getStoremap() {
        return mPreferences.getString(STOREMAP, "");
    }

    public void setWalletmap(String walletmap) {
        mPreferences.edit().putString(WALLETMAP, walletmap).apply();
    }

    public String getWalletmap() {
        return mPreferences.getString(WALLETMAP, "");
    }


    public void setSelectedWalletId(String selectedWalletId) {
        mPreferences.edit().putString(SELECTED_WALLET_ID, selectedWalletId).apply();
    }

    public void setBusinessDetails(String businessDetails) {
        mPreferences.edit().putString(BUSINESS_DETAILS, businessDetails).apply();
    }

    public void setCompanyDetails(String companyDetails) {
        mPreferences.edit().putString(COMPANY_DETAILS, companyDetails).apply();
    }

    public void setAllCurrencyList(String allCurrencyList) {
        mPreferences.edit().putString(ALL_CURRENCY_LIST, allCurrencyList).apply();
    }

    public void setIsDonationAllowed(String value) {
        mPreferences.edit().putString(IS_DONATION_ALLOWED, value).apply();
    }

    public void setIsBillPayment(String value) {
        mPreferences.edit().putString(IS_BILL_PAYMENT, value).apply();
    }

    public void setIsPayReceived(String value) {
        mPreferences.edit().putString(IS_PAY_RECEIVED, value).apply();
    }

    public void setIsPayOrder(String value) {
        mPreferences.edit().putString(IS_PAY_ORDER, value).apply();
    }

    public void setIsCashIn(String value) {
        mPreferences.edit().putString(IS_CASH_IN, value).apply();
    }

    public void setIsOrdermanagement(String value) {
        mPreferences.edit().putString(IS_ORDERMANAGEMENT, value).apply();
    }

    public void setIsProductmanagement(String value) {
        mPreferences.edit().putString(IS_PRODUCTMANAGEMENT, value).apply();
    }

    public void setIsOrdersellreport(String value) {
        mPreferences.edit().putString(IS_ORDERSELLREPORT, value).apply();
    }

    public void setIsPromocode(String value) {
        mPreferences.edit().putString(IS_PROMOCODE, value).apply();
    }

    public void setSupportEmail(String email) {
        mPreferences.edit().putString(SUPPORT_EMAIL, email).apply();
    }

    public void setSupportMobile(String mobile) {
        mPreferences.edit().putString(SUPPORT_MOBILE, mobile).apply();
    }

    public void setIsRequestCashIn(String isRequestCashIn) {
        mPreferences.edit().putString(IS_REQUEST_CASH_IN, isRequestCashIn).apply();
    }

    public void setIsWalletHistory(String value) {
        mPreferences.edit().putString(IS_WALLET_HISTORY, value).apply();
    }

    public void setIsTransactionHistory(String value) {
        mPreferences.edit().putString(IS_TRANSACTION_HISTORY, value).apply();
    }

    public void setIsProfileSetting(String value) {
        mPreferences.edit().putString(IS_PROFILE_SETTING, value).apply();
    }

    public void setIsUserManagement(String value) {
        mPreferences.edit().putString(IS_USER_MANAGEMENT, value).apply();
    }

    public void setIsStoreRequired(String value) {
        mPreferences.edit().putString(IS_STORE_REQUIRED, value).apply();
    }

    public void setIsCustCreationAllowed(String value) {
        mPreferences.edit().putString(IS_CUST_CREATION_ALLOWED, value).apply();
    }


    public void setIsChequeDeposit(String value) {
        mPreferences.edit().putString(IS_CHEQUE_DEPOSIT, value).apply();
    }


    public void setIban(String iban) {
        mPreferences.edit().putString(IBAN, iban).apply();
    }

    public void setName(String name) {
        mPreferences.edit().putString(NAME, name).apply();
    }

    public void setUpiId(String upiId) {
        mPreferences.edit().putString(UPI_ID, upiId).apply();
    }

    public String getUserId() {
        return mPreferences.getString(USER_ID, "");
    }

    public String getUserLoyaltyPoints() {
        return mPreferences.getString(USER_LOYALTY_POINTS, "");
    }

    public String getAccountType() {
        return mPreferences.getString(ACCOUNT_TYPE, "");
    }

    public String getSubRole() {
        return mPreferences.getString(SUB_ROLE, "");
    }

    public String getPrepaidCard_Currency() {
        return mPreferences.getString(PREPAIDCARD_CURRENCY, "");
    }


    public String getIsDealsUsed() {
        return mPreferences.getString(IS_DEALS_USED, "");
    }

    public String getIsFraudCheckAllowed() {
        return mPreferences.getString(IS_FRAUD_CHECK_ALLOWED, "");
    }

    public String getIsFingerprintEnabled() {
        return mPreferences.getString(IS_FINGERPRINT_ENABLED, "");
    }

    public String getAllowCustomerToActivateCard() {
        return mPreferences.getString(ALLOW_CUSTOMER_TO_ACTIVATE_CARD, "");
    }

    public String getIsPrepaidCardFeatureRequired() {
        return mPreferences.getString(IS_PREPAID_CARD_FEATURE_REQUIRED, "0");
    }

    public String getIsRequestCashIn() {
        return mPreferences.getString(IS_REQUEST_CASH_IN, "N");
    }
    /*public String getDefaultCurrencylist(){
        return  mPreferences.getString(DEFAULT_CURRENCYLIST, "");
    }

    public String getAmountDetailCurrencylist(){
        return  mPreferences.getString(AMOUNT_DETAIL_CURRENCYLIST, "");
    }
    public String getWalletsNamesList(){
        return  mPreferences.getString(WALLETS_NAMES_LIST, "");
    }

    public String getCurrencylist(){
        return  mPreferences.getString(CURRENCYLIST, "");
    }*/

    public String getDefaultAmountCurrency() {
        return mPreferences.getString(DEFAULT_AMOUNT_CURRENCY, "");
    }

    public String getSelectedStoreId() {
        return mPreferences.getString(SELECTED_STORE_ID, "");
    }

    public String getSelectedWalletId() {
        return mPreferences.getString(SELECTED_WALLET_ID, "");
    }

    public String getCompanyDetails() {
        return mPreferences.getString(COMPANY_DETAILS, "");
    }

    public String getBusinessDetails() {
        return mPreferences.getString(BUSINESS_DETAILS, "");
    }

    public String getIsDealsWants() {
        return mPreferences.getString(IS_DEALS_WANTS, "");
    }

    public String getIsSendMoneyMerchant() {
        return mPreferences.getString(IS_SEND_MONEY_MERCHANT, "");
    }

    public String getIsRadioAllowed() {
        return mPreferences.getString(IS_RADIO_ALLOWED, "");
    }

    public String getIsRechargeAllowed() {
        return mPreferences.getString(IS_RECHARGE_ALLOWED, "N");
    }

    public String getIsBlockchainAllowed() {
        return mPreferences.getString(IS_BLOCKCHAIN_ALLOWED, "");
    }

    public String getIsMyCardAllowed() {
        return mPreferences.getString(IS_MYCARD_ALLOWED, "");
    }

    public String getIsLoyaltypointsAllowed() {
        return mPreferences.getString(IS_LOYALTYPOINTS_ALLOWED, "");
    }

    public String getIsLoadmoneyAllowed() {
        return mPreferences.getString(IS_LOADMONEY_ALLOWED, "N");
    }

    public String getIsDonationAllowed() {
        return mPreferences.getString(IS_DONATION_ALLOWED, "");
    }

    public String getIsBillPayment() {
        return mPreferences.getString(IS_BILL_PAYMENT, "N");
    }

    public String getIsPayReceived() {
        return mPreferences.getString(IS_PAY_RECEIVED, "N");
    }

    public String getIsPayOrder() {
        return mPreferences.getString(IS_PAY_ORDER, "N");
    }

    public String getIsCashIn() {
        return mPreferences.getString(IS_CASH_IN, "N");
    }

    public String getIsOrdermanagement() {
        return mPreferences.getString(IS_ORDERMANAGEMENT, "N");
    }

    public String getIsProductmanagement() {
        return mPreferences.getString(IS_PRODUCTMANAGEMENT, "N");
    }

    public String getIsPromocode() {
        return mPreferences.getString(IS_PROMOCODE, "N");
    }


    public String getSupportEmail() {
        return mPreferences.getString(SUPPORT_EMAIL, "");
    }

    public String getSupportMobile() {
        return mPreferences.getString(SUPPORT_MOBILE, "");
    }

    public String getIsOrdersellreport() {
        return mPreferences.getString(IS_ORDERSELLREPORT, "N");
    }


    public String getIsWalletHistory() {
        return mPreferences.getString(IS_WALLET_HISTORY, "N");
    }

    public String getIsTransactionHistory() {
        return mPreferences.getString(IS_TRANSACTION_HISTORY, "N");
    }

    public String getIsProfileSetting() {
        return mPreferences.getString(IS_PROFILE_SETTING, "N");
    }

    public String getIsUserManagement() {
        return mPreferences.getString(IS_USER_MANAGEMENT, "0");
    }

    public String getIsStoreRequired() {
        return mPreferences.getString(IS_STORE_REQUIRED, "N");
    }

    public String getIsCustCreationAllowed() {
        return mPreferences.getString(IS_CUST_CREATION_ALLOWED, "0");
    }

    public String getIsChequeDeposit() {
        return mPreferences.getString(IS_CHEQUE_DEPOSIT, "N");
    }

    public String getIsMyBankAllowed() {
        return mPreferences.getString(IS_MY_BANK_ALLOWED, "");
    }

    public String getIsPayAllowed() {
        return mPreferences.getString(IS_PAY_ALLOWED, "");
    }

    public String getIsCustSelectPayOption() {
        return mPreferences.getString(IS_CUST_SELECT_PAY_OPTION, "");
    }

    public String getIsWithdrawmoneyAllowed() {
        return mPreferences.getString(IS_WITHDRAWMONEY_ALLOWED, "");
    }

    public String getIsSendmoneyAllowed() {
        return mPreferences.getString(IS_SENDMONEY_ALLOWED, "N");
    }

    public String getIsRequestmoneyAllowed() {
        return mPreferences.getString(IS_REQUESTMONEY_ALLOWED, "N");
    }

    public String getIsWalletTransferAllowed() {
        return mPreferences.getString(IS_WALLET_TRANSFER_ALLOWED, "");
    }

    public String getIsLoadWithWalletAllowed() {
        return mPreferences.getString(IS_LOAD_WITH_WALLET_ALLOWED, "");
    }

    public String getLoadIntegrationType() {
        return mPreferences.getString(LOAD_INTEGRATION_TYPE, "");
    }

    public String getIsActivitylogAllowed() {
        return mPreferences.getString(IS_ACTIVITYLOG_ALLOWED, "N");
    }

    public String getIsMywalletAllowed() {
        return mPreferences.getString(IS_MYWALLET_ALLOWED, "");
    }

    public String getIsLoadAmountPageAllowed() {
        return mPreferences.getString(IS_LOAD_AMOUNT_PAGE_ALLOWED, "");
    }

    public String getCustCurrency() {
        return mPreferences.getString(CUST_CURRENCY, "");
    }

    public String getSecKey() {
        return mPreferences.getString(SEC_KEY, "");
    }

    public String getVendorWebsite() {
        return mPreferences.getString(VENDOR_WEBSITE, "");
    }

    public String getVendorAddress() {
        return mPreferences.getString(VENDOR_ADDRESS, "");
    }

    public String getVendorCountry() {
        return mPreferences.getString(VENDOR_COUNTRY, "");
    }

    public String getWalletOwnerId() {
        return mPreferences.getString("WALLET_OWNER_ID", "");
    }

    public String getEmailId() {
        return mPreferences.getString(EMAIL_ID, "");
    }

    public String getUserCity() {
        return mPreferences.getString(USER_CITY, "");
    }

    public String getUserState() {
        return mPreferences.getString(USER_STATE, "");
    }

    public String getUserPinCode() {
        return mPreferences.getString(USER_PIN_CODE, "");
    }

    public String getUserName() {
        return mPreferences.getString(USER_NAME, "");
    }


    public String getUserMobileNumber() {
        return mPreferences.getString(USER_MOBILE_NUMBER, "");
    }

    public String getUserAmount() {
        return mPreferences.getString(USER_AMOUNT, "");
    }

    public String getTwCoin() {
        return mPreferences.getString(TW_COIN, "");
    }

    public String getUserPassword() {
        return mPreferences.getString(USER_PASSWORD, "");
    }

    public String getDateOfBirth() {
        return mPreferences.getString(DATE_OF_BIRTH, "");
    }

//    public String getGender() {
//        return mPreferences.getString(GENDER, Constants.Gender.MALE.getGender());
//    }

    public String getProfilePicUrl() {
        return mPreferences.getString(PROFILE_PIC_URL, "X");
    }

    public String getGcmDeviceToken() {
        return mPreferences.getString(GCM_DEVICE_TOKEN, "");
    }

    public int getNumberOfRequests() {
        return mPreferences.getInt(NUMBER_OF_REQUESTS, 0);
    }

//    public int getLanguagePreference() {
//        return mPreferences.getInt(LANGUAGE_PREFERENCE, Constants.LanguageSelected.ENGLISH.ordinal());
//    }

    public int getCurrentLanguage() {
        return mPreferences.getInt(CURRENT_LANGUAGE, 1);
    }

    public String getLanguageKeyPreference() {
        return mPreferences.getString(LANGUAGE_KEY_PREFERENCE, "English");
    }

    public int getLastActivityLogId() {
        return mPreferences.getInt(LAST_ACTIVITY_LOG_ID, 0);
    }

    public String getTransactionHistory() {
        return mPreferences.getString(TRANSACTION_HISTORY, "");
    }

    public int getLastTransactionHistoryId() {
        return mPreferences.getInt(LAST_TRANSACTION_HISTORY_ID, 0);
    }

    public int getLastPassbookTransactionId() {
        return mPreferences.getInt(LAST_PASSBOOK_TRANSACTION_ID, 0);
    }

    public String getIsEmailVerified() {
        return mPreferences.getString(IS_EMAIL_VERIFIED, "Not Provided");
    }

    public String getIsMobileVerified() {
        return mPreferences.getString(IS_MOBILE_VERIFIED, "Not Provided");
    }

    public String getIsMobileCheckedMandatory() {
        return mPreferences.getString(IS_MOBILE_CHECKED_MANDATORY, "N");
    }

    public String getIsEmailCheckedMandatory() {
        return mPreferences.getString(IS_EMAIL_CHECKED_MANDATORY, "N");
    }


    public String getSetPin() {
        return mPreferences.getString(SET_PIN, "N");
    }

    public void setSetPin(String setPin) {
        mPreferences.edit().putString(SET_PIN, setPin).apply();
    }


    public void setExistPin(String existPin) {
        mPreferences.edit().putString(EXIST_PIN, existPin).apply();
    }

    public void setUserId(String userId) {
        mPreferences.edit().putString(USER_ID, userId).apply();
    }

    public void setUserLoyaltyPoints(String userLoyaltyPoints) {
        mPreferences.edit().putString(USER_LOYALTY_POINTS, userLoyaltyPoints).apply();
    }

    public void setAccountType(String userAccountType) {
        mPreferences.edit().putString(ACCOUNT_TYPE, userAccountType).apply();
    }


    public void setSubRole(String subRole) {
        mPreferences.edit().putString(SUB_ROLE, subRole).apply();
    }

    public void setPrepaidCard_Currency(String subRole) {
        mPreferences.edit().putString(PREPAIDCARD_CURRENCY, subRole).apply();
    }


    public void setIsDealsUsed(String isDealsUsed) {
        mPreferences.edit().putString(IS_DEALS_USED, isDealsUsed).apply();
    }

    public void setIsFraudCheckAllowed(String isFraudCheckAllowed) {
        mPreferences.edit().putString(IS_FRAUD_CHECK_ALLOWED, isFraudCheckAllowed).apply();
    }

    public void setIsFingerprintEnabled(String isFingerprintEnabled) {
        mPreferences.edit().putString(IS_FINGERPRINT_ENABLED, isFingerprintEnabled).apply();
    }

    public void setAllowCustomerToActivateCard(String allowCustomerToActivateCard) {
        mPreferences.edit().putString(ALLOW_CUSTOMER_TO_ACTIVATE_CARD, allowCustomerToActivateCard).apply();
    }

    public void setIsPrepaidCardFeatureRequired(String isPrepaidCardFeatureRequired) {
        mPreferences.edit().putString(IS_PREPAID_CARD_FEATURE_REQUIRED, isPrepaidCardFeatureRequired).apply();
    }

    public void setIsDealsWants(String isDealsWants) {
        mPreferences.edit().putString(IS_DEALS_WANTS, isDealsWants).apply();
    }

    public void setIsSendMoneyMerchant(String isSendMoneyMerchant) {
        mPreferences.edit().putString(IS_SEND_MONEY_MERCHANT, isSendMoneyMerchant).apply();
    }

    public void setIsRadioAllowed(String isRadioAllowed) {
        mPreferences.edit().putString(IS_RADIO_ALLOWED, isRadioAllowed).apply();
    }

    public void setIsRechargeAllowed(String isRechargeAllowed) {
        mPreferences.edit().putString(IS_RECHARGE_ALLOWED, isRechargeAllowed).apply();
    }

    public void setIsBlockchainAllowed(String isBlockchainAllowed) {
        mPreferences.edit().putString(IS_BLOCKCHAIN_ALLOWED, isBlockchainAllowed).apply();
    }

    public void setIsMyCardAllowed(String isMyCardAllowed) {
        mPreferences.edit().putString(IS_MYCARD_ALLOWED, isMyCardAllowed).apply();
    }

    public void setIsLoyaltypointsAllowed(String isLoyaltypointsAllowed) {
        mPreferences.edit().putString(IS_LOYALTYPOINTS_ALLOWED, isLoyaltypointsAllowed).apply();
    }

    public void setIsLoadmoneyAllowed(String isLoadmoneyAllowed) {
        mPreferences.edit().putString(IS_LOADMONEY_ALLOWED, isLoadmoneyAllowed).apply();
    }

    public void setIsMyBankAllowed(String isMyBankAllowed) {
        mPreferences.edit().putString(IS_MY_BANK_ALLOWED, isMyBankAllowed).apply();
    }

    public void setIsWithdrawmoneyAllowed(String isWithdrawmoneyAllowed) {
        mPreferences.edit().putString(IS_WITHDRAWMONEY_ALLOWED, isWithdrawmoneyAllowed).apply();
    }

    public void setIsRequestmoneyAllowed(String isRequestmoneyAllowed) {
        mPreferences.edit().putString(IS_REQUESTMONEY_ALLOWED, isRequestmoneyAllowed).apply();
    }

    public void setIsWalletTransferAllowed(String isWalletTransferAllowed) {
        mPreferences.edit().putString(IS_WALLET_TRANSFER_ALLOWED, isWalletTransferAllowed).apply();
    }

    public void setIsLoadWithWalletAllowed(String isLoadWithWalletAllowed) {
        mPreferences.edit().putString(IS_LOAD_WITH_WALLET_ALLOWED, isLoadWithWalletAllowed).apply();
    }

    public void setLoadIntegrationType(String loadIntegrationType) {
        mPreferences.edit().putString(LOAD_INTEGRATION_TYPE, loadIntegrationType).apply();
    }

    public void setIsSendmoneyAllowed(String isSendmoneyAllowed) {
        mPreferences.edit().putString(IS_SENDMONEY_ALLOWED, isSendmoneyAllowed).apply();
    }

    public void setIsPayAllowed(String isPayAllowed) {
        mPreferences.edit().putString(IS_PAY_ALLOWED, isPayAllowed).apply();
    }

    public void setIsselectPayOption(String isSelectpayOption) {
        mPreferences.edit().putString(IS_CUST_SELECT_PAY_OPTION, isSelectpayOption).apply();
    }

    public void setIsActivitylogAllowed(String isActivitylogAllowed) {
        mPreferences.edit().putString(IS_ACTIVITYLOG_ALLOWED, isActivitylogAllowed).apply();
    }

    public void setIsMywalletAllowed(String isMywalletAllowed) {
        mPreferences.edit().putString(IS_MYWALLET_ALLOWED, isMywalletAllowed).apply();
    }

    public void setIsLoadAmountPageAllowed(String isLoadAmountPageAllowed) {
        mPreferences.edit().putString(IS_LOAD_AMOUNT_PAGE_ALLOWED, isLoadAmountPageAllowed).apply();
    }

    public void setCustCurrency(String custCurrency) {
        mPreferences.edit().putString(CUST_CURRENCY, custCurrency).apply();
    }

    public void setSecKey(String secKey) {
        mPreferences.edit().putString(SEC_KEY, secKey).apply();
    }

    public void setVendorWebsite(String vendorWebsite) {
        mPreferences.edit().putString(VENDOR_WEBSITE, vendorWebsite).apply();
    }

    public void setVendorAddress(String vendorAddress) {
        mPreferences.edit().putString(VENDOR_ADDRESS, vendorAddress).apply();
    }

    public void setVendorCountry(String vendorCountry) {
        mPreferences.edit().putString(VENDOR_COUNTRY, vendorCountry).apply();
    }

    public void setEmailId(String emailId) {
        mPreferences.edit().putString(EMAIL_ID, emailId).apply();
    }

    public void setUserName(String userName) {
        mPreferences.edit().putString(USER_NAME, userName).apply();
    }

    public void setUserCity(String city) {
        mPreferences.edit().putString(USER_CITY, city).apply();
    }

    public void setUserState(String state) {
        mPreferences.edit().putString(USER_STATE, state).apply();
    }

    public void setUserPinCode(String pinCode) {
        mPreferences.edit().putString(USER_PIN_CODE, pinCode).apply();
    }


    public void setUserMobileNumber(String mobileNumber) {
        mPreferences.edit().putString(USER_MOBILE_NUMBER, mobileNumber).apply();
    }

    public void setUserAmount(String userAmount) {
        mPreferences.edit().putString(USER_AMOUNT, userAmount).apply();
    }

    public void setTwCoin(String twCoin) {
        mPreferences.edit().putString(TW_COIN, twCoin).apply();
    }

    public void setDateOfBirth(String dateOfBirth) {
        mPreferences.edit().putString(DATE_OF_BIRTH, dateOfBirth).apply();
    }

    public void setProfilePicUrl(String profilePicUrl) {
        mPreferences.edit().putString(PROFILE_PIC_URL, profilePicUrl).apply();
    }

    public void setNumberOfRequests(int numberOfRequests) {
        mPreferences.edit().putInt(NUMBER_OF_REQUESTS, numberOfRequests).apply();
    }

    public void setQRCodeUrl(String qrCodeUrl) {
        mPreferences.edit().putString(USER_QR_CODE_URL, qrCodeUrl).apply();
    }

    public void setUserPassword(String userPassword) {
        mPreferences.edit().putString(USER_PASSWORD, userPassword).apply();
    }

    public void setGender(String gender) {
        mPreferences.edit().putString(GENDER, gender).apply();
    }

    public void setLanguagePreference(int languagePreference) {
        mPreferences.edit().putInt(LANGUAGE_PREFERENCE, languagePreference).apply();
    }

    public void setCurrentLanguage(int languagePreference) {
        mPreferences.edit().putInt(CURRENT_LANGUAGE, languagePreference).apply();
    }

    public void setLanguageKeyPreference(String languagePreference) {
        mPreferences.edit().putString(LANGUAGE_KEY_PREFERENCE, languagePreference).apply();
    }

    public void setGcmDeviceToken(String gcmDeviceToken) {
        mPreferences.edit().putString(GCM_DEVICE_TOKEN, gcmDeviceToken).apply();
    }

    public void setLastActivityLogId(int lastActivityLogId) {
        mPreferences.edit().putInt(LAST_ACTIVITY_LOG_ID, lastActivityLogId).apply();
    }

    public void setLastTransactionHistoryId(int lastTransactionHistoryId) {
        mPreferences.edit().putInt(LAST_TRANSACTION_HISTORY_ID, lastTransactionHistoryId).apply();
    }

    public void setLastPassbookTransactionId(int lastPassbookTransactionId) {
        mPreferences.edit().putInt(LAST_PASSBOOK_TRANSACTION_ID, lastPassbookTransactionId).apply();
    }

    public void setIsEmailVerified(String isEmailVerified) {
        mPreferences.edit().putString(IS_EMAIL_VERIFIED, isEmailVerified).apply();
    }

    public void setIsMobileVerified(String isMobileVerified) {
        mPreferences.edit().putString(IS_MOBILE_VERIFIED, isMobileVerified).apply();
    }


    public void setIsMobileCheckedMandatory(String isMobileCheckedMandatory) {
        mPreferences.edit().putString(IS_MOBILE_CHECKED_MANDATORY, isMobileCheckedMandatory).apply();
    }

    public void setIsEmailCheckedMandatory(String isEmailCheckedMandatory) {
        mPreferences.edit().putString(IS_EMAIL_CHECKED_MANDATORY, isEmailCheckedMandatory).apply();
    }

    public void setTransactionHistoryList(String jsonText) {
        mPreferences.edit().putString(TRANSACTION_HISTORY, jsonText).apply();
    }

    public boolean userIsAuthenticated() {
        return !getUserId().equals("");
    }

    public boolean isUserLoyaltyPointGet() {
        return !getUserLoyaltyPoints().equals("");
    }

    public void setLockScreen(String lockScreen) {
        mPreferences.edit().putString(LOCK_SCREEN, lockScreen).apply();
    }

    public String getLockScreen() {
        return mPreferences.getString(LOCK_SCREEN, null);
    }


    public void setLockScreenWallet(String lockScreenWallet) {
        mPreferences.edit().putString(LOCK_SCREEN_WALLET, lockScreenWallet).apply();
    }

    public String getLockScreenWallet() {
        return mPreferences.getString(LOCK_SCREEN_WALLET, null);
    }


    public void setDefaultLockScreen(boolean lockScreen) {
        mPreferences.edit().putBoolean(DEFAULT_LOCK_SCREEN, lockScreen).apply();
    }

    public boolean getDefaultLockScreen() {
        return mPreferences.getBoolean(DEFAULT_LOCK_SCREEN, false);
    }


    public void setUserAuthenticated(boolean userAuthenticated) {
        mPreferences.edit().putBoolean(USER_AUTHENTICATED, userAuthenticated).apply();
    }

    public boolean getUserAuthenticated() {
        return mPreferences.getBoolean(USER_AUTHENTICATED, false);
    }

    public void setConfirmPassword(boolean userAuthenticated) {
        mPreferences.edit().putBoolean(CONFIRM_PASSWORD, userAuthenticated).apply();
    }

    public boolean getConfirmPassword() {
        return mPreferences.getBoolean(CONFIRM_PASSWORD, false);
    }

    public void setConfirmPasswordVerified(boolean userAuthenticated) {
        mPreferences.edit().putBoolean(CONFIRM_PASSWORD_VERIFIED, userAuthenticated).apply();
    }

    public boolean getConfirmPasswordVerified() {
        return mPreferences.getBoolean(CONFIRM_PASSWORD_VERIFIED, false);
    }


    public void setDefaultLockScreenWallet(boolean defaultLockScreenWallet) {
        mPreferences.edit().putBoolean(DEFAULT_LOCK_SCREEN_WALLET, defaultLockScreenWallet).apply();
    }

    public boolean getDefaultLockScreenWallet() {
        return mPreferences.getBoolean(DEFAULT_LOCK_SCREEN_WALLET, false);
    }

    public void setSessionTimeout(int sessionTimeout) {
        mPreferences.edit().putInt(SESSION_TIMEOUT, sessionTimeout).apply();
    }

    public String getLOCAl_LANGUAGE() {
        return mPreferences.getString(LOCAl_LANGUAGE, "");
    }

    public void setLOCAl_LANGUAGE(String language) {
        mPreferences.edit().putString(LOCAl_LANGUAGE, language).apply();

    }

    public String get_IS_APP_REOPEN() {
        return mPreferences.getString(IS_APP_REOPEN, "0");
    }

    public void set_IS_APP_REOPEN(String openingType) {
        mPreferences.edit().putString(IS_APP_REOPEN, openingType).apply();

    }

    public String getCashin() {
        return mPreferences.getString(CASHIN, "0");
    }

    public void setCashin(String cashin) {
        mPreferences.edit().putString(CASHIN, cashin).apply();

    }


    public boolean get_IS_SMS_OTP() {
        return mPreferences.getBoolean(IS_SMS_OTP, false);
    }

    public boolean get_IS_USER_LOGGEDIN() {
        return mPreferences.getBoolean(IS_USER_LOGGEDIN, false);
    }

    public void set_IS_USER_LOGGEDIN(boolean isOtp) {
        mPreferences.edit().putBoolean(IS_USER_LOGGEDIN, isOtp).apply();
    }


//    public void set_IS_SMS_OTP_FOR_SIGNUP(boolean otp) {
//        mPreferences.edit().putBoolean(IS_APP_REOPEN, otp).apply();
//
//    }
//


//    public boolean get_IS_SMS_OTP_FOR_SIGNUP() {
//        return mPreferences.getBoolean(IS_SMS_OTP, false);
//    }

    public void set_IS_SMS_OTP(boolean isOtp) {
        mPreferences.edit().putBoolean(IS_SMS_OTP, isOtp).apply();

    }

    public int getSessionTimeout() {
        return mPreferences.getInt(SESSION_TIMEOUT, 0);
    }

    public void setCounter(int counter) {
        mPreferences.edit().putInt(COUNTER, counter).apply();
    }

    public int getCounter() {
        return mPreferences.getInt(COUNTER, 0);
    }

    public String getSendpinallowed() {
        return mPreferences.getString(SENDPINALLOWED, "");
    }

    public void setSendpinallowed(String sendpinallowed) {
        mPreferences.edit().putString(SENDPINALLOWED, sendpinallowed).apply();
    }


    public String getRequestpinallowed() {
        return mPreferences.getString(REQUESTPINALLOWED, "");
    }

    public void setRequestpinallowed(String requestpinallowed) {
        mPreferences.edit().putString(REQUESTPINALLOWED, requestpinallowed).apply();
    }

    public String getLoadpinallowed() {
        return mPreferences.getString(LOADPINALLOWED, "0");
    }

    public void setLoadpinallowed(String loadpinallowed) {
        mPreferences.edit().putString(LOADPINALLOWED, loadpinallowed).apply();
    }

    public String getWithdrawpinallowed() {
        return mPreferences.getString(WITHDRAWPINALLOWED, "");
    }

    public void setWithdrawpinallowed(String withdrawpinallowed) {
        mPreferences.edit().putString(WITHDRAWPINALLOWED, withdrawpinallowed).apply();
    }

    public String getPaypinallowed() {
        return mPreferences.getString(PAYPINALLOWED, "");
    }

    public void setPaypinallowed(String paypinallowed) {
        mPreferences.edit().putString(PAYPINALLOWED, paypinallowed).apply();
    }

    public String getCashoutpinallowed() {
        return mPreferences.getString(CHECKOUTPINALLOWED, "");
    }

    public void setCashoutpinallowed(String checkoutpinallowed) {
        mPreferences.edit().putString(CHECKOUTPINALLOWED, checkoutpinallowed).apply();
    }

    public String getPayorderpinallowed() {
        return mPreferences.getString(PAYORDERPINALLOWED, "");
    }

    public void setPayorderpinallowed(String payorderpinallowed) {
        mPreferences.edit().putString(PAYORDERPINALLOWED, payorderpinallowed).apply();
    }


    public String getPurchasepinallowed() {
        return mPreferences.getString(PURCHASEPINALLOWED, "");
    }

    public void setPurchasepinallowed(String purchasepinallowed) {
        mPreferences.edit().putString(PURCHASEPINALLOWED, purchasepinallowed).apply();
    }

    public String getEntitytype() {
        return mPreferences.getString(ENTITYTYPE, "");
    }

    public void setEntitytype(String entitytype) {
        mPreferences.edit().putString(ENTITYTYPE, entitytype).apply();
    }

    public String getSelectedWallet() {
        return mPreferences.getString(SELECTEDWALLET, "");
    }

    public void setSelectedWallet(String selectedWallet) {
        mPreferences.edit().putString(SELECTEDWALLET, selectedWallet).apply();
    }

    public String getSelectedStore() {
        return mPreferences.getString(SELECTEDSTORE, "");
    }

    public void setSelectedStore(String selectedstore) {
        mPreferences.edit().putString(SELECTEDSTORE, selectedstore).apply();
    }

    public void clearUserData() {
        // mPreferences.edit().remove(USER_ID).apply();
        //mPreferences.edit().remove(EMAIL_ID).apply();
        mPreferences.edit().remove(USER_NAME).apply();
        mPreferences.edit().remove(USER_MOBILE_NUMBER).apply();
        mPreferences.edit().remove(USER_AMOUNT).apply();
        mPreferences.edit().remove(TW_COIN).apply();
        mPreferences.edit().remove(USER_PASSWORD).apply();
        mPreferences.edit().remove(NUMBER_OF_REQUESTS).apply();
        mPreferences.edit().remove(DATE_OF_BIRTH).apply();
        mPreferences.edit().remove(GENDER).apply();
        mPreferences.edit().remove(PROFILE_PIC_URL).apply();
        mPreferences.edit().remove(USER_QR_CODE_URL).apply();
        mPreferences.edit().remove(USER_LOYALTY_POINTS).apply();
        mPreferences.edit().remove(ACCOUNT_TYPE).apply();
        mPreferences.edit().remove(SUB_ROLE).apply();
        mPreferences.edit().remove(IS_DEALS_USED).apply();
        //mPreferences.edit().remove(IS_FINGERPRINT_ENABLED).apply();
        mPreferences.edit().remove(ALLOW_CUSTOMER_TO_ACTIVATE_CARD).apply();
        mPreferences.edit().remove(IS_PREPAID_CARD_FEATURE_REQUIRED).apply();
        mPreferences.edit().remove(IS_DEALS_WANTS).apply();
        mPreferences.edit().remove(CUST_CURRENCY).apply();
        mPreferences.edit().remove(SEC_KEY).apply();
        mPreferences.edit().remove(VENDOR_WEBSITE).apply();
        mPreferences.edit().remove(VENDOR_ADDRESS).apply();
        mPreferences.edit().remove(VENDOR_COUNTRY).apply();
        mPreferences.edit().remove(GCM_DEVICE_TOKEN).apply();
        mPreferences.edit().remove(CUSTOMER_ADDRESS_TYPE).apply();
        mPreferences.edit().remove(CUSTOMER_ADDRESS_NAME).apply();
        mPreferences.edit().remove(CUSTOMER_ADDRESS_PHONE).apply();
        mPreferences.edit().remove(CUSTOMER_ADDRESS_PHONE).apply();
        mPreferences.edit().remove(CUSTOMER_ADDRESS_CITY).apply();
        mPreferences.edit().remove(CUSTOMER_ADDRESS_STATE).apply();
        mPreferences.edit().remove(CUSTOMER_ADDRESS_COUNTRY).apply();
        mPreferences.edit().remove(CUSTOMER_ADDRESS).apply();
        mPreferences.edit().remove(CUSTOMER_ADDRESS_LANDMARK).apply();
        mPreferences.edit().remove(CUSTOMER_ADDRESS_ALTERNATE_PHONE).apply();
        mPreferences.edit().remove(COUNTRY_CODE).apply();
        mPreferences.edit().remove(MERCHANT_USER_NAME).apply();
        mPreferences.edit().remove(TO_ID).apply();
        mPreferences.edit().remove(PARTNER_ID).apply();
        mPreferences.edit().remove(TO_TYPE).apply();
        mPreferences.edit().remove(REDIRECT_URL).apply();
        //mPreferences.edit().remove(LANGUAGE).apply();
        mPreferences.edit().remove(TERMINAL_ID).apply();
        mPreferences.edit().remove(MERCHANT_PWD).apply();
        mPreferences.edit().remove(AUTHTOKEN).apply();
        mPreferences.edit().remove(MERCHANT_SEC_KEY).apply();
        mPreferences.edit().remove(PAYMENT_TYPE).apply();
        mPreferences.edit().remove(PAYMENT_BRAND).apply();
        mPreferences.edit().remove(PAYMENT_MODE).apply();
        mPreferences.edit().remove(TRANSACTION_URL).apply();
        mPreferences.edit().remove(IS_SEND_MONEY_MERCHANT).apply();
        mPreferences.edit().remove(KYC_ACCOUNT_TYPE).apply();
        mPreferences.edit().remove(IS_RECHARGE_ALLOWED).apply();
        mPreferences.edit().remove(IS_BLOCKCHAIN_ALLOWED).apply();
        mPreferences.edit().remove(IS_MYCARD_ALLOWED).apply();
        mPreferences.edit().remove(IS_LOADMONEY_ALLOWED).apply();
        mPreferences.edit().remove(IS_WITHDRAWMONEY_ALLOWED).apply();
        mPreferences.edit().remove(IS_SENDMONEY_ALLOWED).apply();
        mPreferences.edit().remove(IS_REQUESTMONEY_ALLOWED).apply();
        mPreferences.edit().remove(IS_ACTIVITYLOG_ALLOWED).apply();
        mPreferences.edit().remove(IS_MYWALLET_ALLOWED).apply();
        mPreferences.edit().remove(IS_LOYALTYPOINTS_ALLOWED).apply();
        mPreferences.edit().remove(IBAN).apply();
        mPreferences.edit().remove(FEE_ACCOUNT).apply();
        mPreferences.edit().remove(BALANCE).apply();
        mPreferences.edit().remove(NAME).apply();
        mPreferences.edit().remove(DEFAULT_AMOUNT_CURRENCY).apply();
        mPreferences.edit().remove(SELECTED_STORE_ID).apply();
        mPreferences.edit().remove(SELECTED_WALLET_ID).apply();
        mPreferences.edit().remove(WALLETMAP).apply();
        mPreferences.edit().remove(STOREMAP).apply();
        mPreferences.edit().remove(DASHBOARD_SEND_MONEY).apply();
        mPreferences.edit().remove(DASHBOARD_MY_WALLET).apply();
        mPreferences.edit().remove(IS_LOAD_AMOUNT_PAGE_ALLOWED).apply();
        mPreferences.edit().remove(LAST_ACTIVITY_LOG_ID).apply();
        mPreferences.edit().remove(LAST_TRANSACTION_HISTORY_ID).apply();
        mPreferences.edit().remove(LAST_PASSBOOK_TRANSACTION_ID).apply();
        mPreferences.edit().remove(SESSION_TIMEOUT).apply();
        mPreferences.edit().remove(PREPAIDCARD_CURRENCY).apply();
       /* mPreferences.edit().remove(LOCK_SCREEN).apply();
        mPreferences.edit().remove(DEFAULT_LOCK_SCREEN).apply();
        mPreferences.edit().remove(LOCK_SCREEN_WALLET).apply();
        mPreferences.edit().remove(DEFAULT_LOCK_SCREEN_WALLET).apply();
        mPreferences.edit().remove(DEFAULT_LOCK_SCREEN_WALLET).apply();*/
        // mPreferences.edit().clear().apply();
    }
}


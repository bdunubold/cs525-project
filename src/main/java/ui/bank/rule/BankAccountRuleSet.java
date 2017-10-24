package ui.bank.rule;

import framework.ClientType;
import framework.DataMap;

import java.util.regex.Pattern;

public class BankAccountRuleSet implements RuleSet{
    @Override
    public void validate(DataMap dataMap) {
//        AccounTypeEnum accounType, String accountNumber,
        //                String name, String street, String city, String state,
        //                String zip, String email, int numOfEmployees, ClientType clientType

        if(dataMap.getName() == null || dataMap.getName().trim().equals("")){
            throw new IllegalArgumentException("account name can not be empty!");
        }

        if(dataMap.getStreet() == null|| dataMap.getStreet().trim().equals("")){
            throw new IllegalArgumentException("street can not be empty!");
        }

        if(dataMap.getCity() == null|| dataMap.getCity().trim().equals("")){
            throw new IllegalArgumentException("city can not be empty!");
        }

        if(dataMap.getState() == null|| dataMap.getState().trim().equals("")){
            throw new IllegalArgumentException("street can not be empty!");
        }

        if(isNumric(dataMap.getZip())){
            throw new IllegalArgumentException("street can not be empty!");
        }

        if(!(Pattern.compile(".*@.*\\.com").matcher(dataMap.getEmail()).matches())){
            throw new IllegalArgumentException("the format of email is wrong!");
        }

if(dataMap.getClientType() == null){
    throw new IllegalArgumentException("client type can not be null!");
}

        if(dataMap.getClientType() == ClientType.COMPANY){
           if(dataMap.getNumOfEmployees() == null){
                   throw new IllegalArgumentException("numOfEmployees can not be null!");
           }
        }else  if(dataMap.getClientType() == ClientType.INDIVIDUAL){
            if(dataMap.getBirthday() == null){
                throw new IllegalArgumentException("birthday can not be null!");
            }
        }

    }

    private boolean isNumric(String numStr){
        if(numStr == null){
            return false;
        }
        for(int i=0; i< numStr.length(); i++){
            if(!Character.isDigit(numStr.charAt(i))){
                return false;
            }
        }

        return true;
    }
}

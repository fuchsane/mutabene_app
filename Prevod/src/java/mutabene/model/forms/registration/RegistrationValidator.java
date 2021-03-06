/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.model.forms.registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import mutabene.model.entity.User;
//import mutabene.service.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


/**
 *
 * @author stenlik
 */
@Component
public class RegistrationValidator implements Validator {

    //UserManager userManager;
    
    @Override
    public boolean supports(Class<?> type) {
        if(type.equals(RegistrationValidator.class)) return true; else return false;
    }

    @Override
    public void validate(Object o, Errors errors) {
        RegistrationModel model = (RegistrationModel) o ;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user.firstname", null,"Tato položka je povinná. Jméno musí být vyplněno !");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user.surname", null, "Tato položka je povinná. Příjmení musí být vyplněno !");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user.gender", null, "Tato položka je povinná. Pohlaví musí být vyplněno !");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user.email", null, "Tato položka je povinná. Email musí být vyplněn !");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user.login", null,"Tato položka je povinná. Uživatelské jméno musí být vyplněno !");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user.password", null, "Tato položka je povinná. Heslo musí být vyplněno !");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", null, "Tato položka je povinná. Potvrzení hesla musí být vyplněno !");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address.city", null, "Tato položka je povinná. Město musí být vyplněno !");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address.street", null,"Tato položka je povinná. Ulice musí být vyplněno !");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address.zipCode", null, "Tato položka je povinná. PSČ musí být vyplněno !");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "regionId", null, "Tato položka je povinná. Musíte vybrat region !");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "centerId", null, "Tato položka je povinná. Musíte vybrat centrum !");
        
//        if(!isValidEmailAddress(model.getUser().getEmail()) && model.getUser().getEmail() != ""){
//            errors.rejectValue("user.email", null, "Email má nesprávný formát !");
//            errors.rejectValue("errors", null, "Email má nesprávný formát !");
//        }
//        
//        if(!isUserNameFree(model.getUser().getLogin())){
//            errors.rejectValue("user.login", null, "Toto uživatelské jméno je již použito !");
//            errors.rejectValue("errors", null, "Toto uživatelské jméno je již použito !");
//        }
//        
//        if(!model.getUser().getPassword().equals(model.getConfirmPassword())){
//            errors.rejectValue("user.password", null, "Zadaná hesla se neshodují !");
//            errors.rejectValue("errors", null, "Zadaná hesla se neshodují !");
//        }
            
    }

//    public @Autowired void setUserManager(UserManager userManager) {
//        this.userManager = userManager;
//    }

    private boolean isValidEmailAddress(String emailAddress){
        String  expression="^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";  
        CharSequence inputStr = emailAddress;  
        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);  
        Matcher matcher = pattern.matcher(inputStr);  
   return matcher.matches();  
    }
    
//    private boolean isUserNameFree(String login){
//       User user = userManager.findByLogin(login);
//       if(user == null){
//           return true;
//       } else {
//           return false;
//       }
//   }
 }  

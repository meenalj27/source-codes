
package Security;
public class EncryptDecryptPass {

    public static void main(String[] args) {
        try {
        String Message = "This is a good.";
            System.out.println("plain pass="+Message);
        String encryptedPassword = AESCrypt.encrypt(Message);
            System.out.println("encrypted pass="+encryptedPassword);
        String decryptedPassword = AESCrypt.decrypt(encryptedPassword);    
                System.out.println("decrypted pass="+decryptedPassword);
        } catch(Exception e) { System.out.println("bug"+e.getMessage()); }
    }    
}


import org.junit.Test
import org.junit.Assert.*
class PasswordValidatorTest {

    @Test
    fun testMotDePasseValide() {
        assertTrue(validerMotDePasse("Nizar123"))
    }

    @Test
    fun testLongueurInferieureA8() {
        assertFalse(validerMotDePasse("Niz123"))
    }

    @Test
    fun testSansMajuscule() {
        assertFalse(validerMotDePasse("nizar123"))
    }

    @Test
    fun testSansChiffre() {
        assertFalse(validerMotDePasse("Nizarabcd"))
    }

    @Test
    fun testPlusieursMotsDePasse() {
        assertTrue(validerMotDePasse("Bonjour123"))
        assertFalse(validerMotDePasse("bonjour123"))
        assertFalse(validerMotDePasse("Bonjour"))
    }
}

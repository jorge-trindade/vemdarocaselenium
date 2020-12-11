package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class informacoesUsuarioTest {
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
    System.setProperty("webdriver.chrome.driver","/home/jorge/drivers/chromedriver");
        WebDriver navegador = new ChromeDriver(); /* linha que abre o navegador*/
        //Acessar o Site Vem da Roça
        navegador.get("http://vemdaroca.herokuapp.com/login");

        //Digitar o Usuário
        navegador.findElement(By.id("mat-input-0")).sendKeys("jorge_admin");
        //digitar senha
        navegador.findElement(By.id("mat-input-1")).sendKeys("050589");
        //clicar no link que possui o entrar
        navegador.findElement(By.className("mat-button-wrapper")).click();
        assertEquals(1,1);
    }
}

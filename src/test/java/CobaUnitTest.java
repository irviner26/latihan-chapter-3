import org.chaptertiga.topic1.TopicUnitTesting;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CobaUnitTest {
    TopicUnitTesting topicUnitTesting;

    @BeforeEach
    public void init() {
        topicUnitTesting = new TopicUnitTesting();
        System.out.println(" Definisi class dari method");
    }

    @AfterEach
    public void tearDown() {
        topicUnitTesting = null;
        System.out.println("Class di-null-kan");
    }

    @Test
    public void testGaLulus() {
        List<Integer> nilaiKelasB;
        Integer[] arrayB = {80, 85, 88, 55, 40};
        nilaiKelasB = Arrays.asList(arrayB);
        Integer hasil = topicUnitTesting.gaLulus(nilaiKelasB);
        Assertions.assertEquals(2, hasil);
    }

    @Test
    public void testNilaiTinggi() {
        List<Integer> nilaiKelasB;
        Integer[] arrayB = {80, 85, 88, 55, 40};
        nilaiKelasB = Arrays.asList(arrayB);
        Integer hasil = topicUnitTesting.nilaiTertinggi(nilaiKelasB);
        Assertions.assertEquals(88, hasil);
    }

    @Test
    public void testNilaiRendah() {
        List<Integer> nilaiKelasB;
        Integer[] arrayB = {80, 85, 88, 55, 40};
        nilaiKelasB = Arrays.asList(arrayB);
        Integer hasil = topicUnitTesting.nilaiTerendah(nilaiKelasB);
        Assertions.assertEquals(40, hasil);
    }

    @Test
    public void testPalingBanyak() {
        List<Integer> nilaiKelasA;
        Integer[] arrayA = {90, 85, 89, 77, 60, 88, 80, 90, 45, 70};
        nilaiKelasA = Arrays.asList(arrayA);

        List<Integer> nilaiKelasB;
        Integer[] arrayB = {80, 85, 88, 55, 40};
        nilaiKelasB = Arrays.asList(arrayB);

        List<Integer> nilaiKelasC;
        Integer[] arrayC = {85, 50, 40, 35, 15};
        nilaiKelasC = Arrays.asList(arrayC);

        Integer hasil = topicUnitTesting.banyakGaLulus(nilaiKelasA,nilaiKelasB,nilaiKelasC);
        Assertions.assertEquals(3, hasil);

    }

}

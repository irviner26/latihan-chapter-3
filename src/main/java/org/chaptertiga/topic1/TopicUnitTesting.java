package org.chaptertiga.topic1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopicUnitTesting {
    public static void main(String[] args) {
        List<Integer> nilaiKelasA;
        Integer[] arrayA = {90, 85, 89, 77, 60, 88, 80, 90, 45, 70};
        nilaiKelasA = Arrays.asList(arrayA);

        List<Integer> nilaiKelasB;
        Integer[] arrayB = {80, 85, 88, 55, 40};
        nilaiKelasB = Arrays.asList(arrayB);

        List<Integer> nilaiKelasC;
        Integer[] arrayC = {85, 50, 95, 35, 15};
        nilaiKelasC = Arrays.asList(arrayC);

    }

    public Integer gaLulus(List<Integer> listNilai) {
        Integer jumlahGaLulus = 0;
        for (Integer i : listNilai) {
            if (i < 70) {
                jumlahGaLulus += 1;
            }
        }
        return jumlahGaLulus;
    }

    public Integer nilaiTertinggi(List<Integer> listNilai) {
        Integer tertinggi = listNilai.get(0);
        for (Integer i : listNilai) {
            if (tertinggi < i) {
                tertinggi = i;
            }
        }
        return tertinggi;
    }

    public Integer nilaiTerendah(List<Integer> listNilai) {
        Integer terendah = listNilai.get(0);
        for (Integer i : listNilai) {
            if (terendah > i) {
                terendah = i;
            }
        }
        return terendah;
    }

    public Integer banyakGaLulus(List<Integer> listNilai1,
                                 List<Integer> listNilai2,
                                 List<Integer> listNilai3) {
        List<Integer> jmlhGaLulus = new ArrayList<>();
        jmlhGaLulus.add(gaLulus(listNilai1));
        jmlhGaLulus.add(gaLulus(listNilai2));
        jmlhGaLulus.add(gaLulus(listNilai3));

        Integer index = jmlhGaLulus.indexOf(nilaiTertinggi(jmlhGaLulus)) + 1;
        return index;
    }
}

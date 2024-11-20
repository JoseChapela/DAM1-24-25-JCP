/**José Chapela Pastoriza */

package ud2.jcpexamen;

public class ChiclesDeRegalo {
    public static void main(String[] args) {

        int n = 10, m = -1, o = 1;

        System.out.println(totalChicles(n, m, o));

    }

    public static int totalChicles(int chiclesComprados, int cadaCuantoGratis, int chiclesGratis) {
        if (chiclesComprados < 0 || cadaCuantoGratis < 0 || chiclesGratis < 0 || chiclesGratis > cadaCuantoGratis)
            return -1;

        if (cadaCuantoGratis == 0)
            return chiclesComprados;

        int totalChicles = 0;

        totalChicles = chiclesComprados / cadaCuantoGratis * chiclesGratis;
        totalChicles += totalChicles / cadaCuantoGratis * chiclesGratis;
        totalChicles += chiclesComprados;

        return totalChicles;
    }

}

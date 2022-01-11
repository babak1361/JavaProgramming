package OfficeHours;

import day31_Constructors.ScumTask.ScrumTeam;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        String[] scrum1 ={"Bob","Jim","Mile"};

        String[] scrum2 ={"Jack","Jon","Mike"};

        String[] scrum3 ={"Ali","July","Mary","kdy"};

        String[][] scrumTeams ={{"Bob","Jim","Mile"},{"Jack","Jon","Mike"},{"Ali","July","Mary","kdy"}};
        String[][][] scrumTeams1 ={{{"Bob","Jim","Mile"},{"Jack","Jon","Mike"}},{{"Ali","July","Mary","kdy"}}};

        System.out.println(Arrays.deepToString(scrumTeams));

        System.out.println(scrum2[1]);
        System.out.println(scrumTeams[2][0]);

        System.out.println(scrumTeams1[0][1][1]);

        for (String[][] each : scrumTeams1) {
            System.out.println(Arrays.deepToString(each));
        }

    }
}

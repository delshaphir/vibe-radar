package com.example.viberadar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sounds {

    // NOTES
    /*
    final static int C = R.raw.c;
    final static int D = R.raw.d;
    final static int E = R.raw.e;
    final static int F = R.raw.f;
    final static int G = R.raw.g;
    final static int A = R.raw.a;
    final static int B = R.raw.b;
    final static int CC = R.raw.cc;
    */

    //final static List<Integer> NOTES = Arrays.asList(C, D, E, F, G, A, B, CC);

    // CHORDS
    final static int C_MAJ1 = R.raw.cmaj1;
    final static int C_MAJ2 = R.raw.cmaj2;
    final static int C_MAJ3 = R.raw.cmaj3;
    //final static List<Integer> C_MAJ = Arrays.asList(C_MAJ1, C_MAJ2, C_MAJ3);
    final static int[] C_MAJ = {C_MAJ1, C_MAJ2, C_MAJ3};

    final static int D_MIN1 = R.raw.dmin1;
    final static int D_MIN2 = R.raw.dmin2;
    final static int D_MIN3 = R.raw.dmin3;
    //final static List<Integer> D_MIN = Arrays.asList(D_MIN1, D_MIN2, D_MIN3);
    final static int[] D_MIN = {D_MIN1, D_MIN2, D_MIN3};

    final static int E_MIN1 = R.raw.emin1;
    final static int E_MIN2 = R.raw.emin2;
    final static int E_MIN3 = R.raw.emin3;
    //final static List<Integer> E_MIN = Arrays.asList(E_MIN1, E_MIN2, E_MIN3);
    final static int[] E_MIN = {E_MIN1, E_MIN2, E_MIN3};

    final static int F_MAJ1 = R.raw.fmaj1;
    final static int F_MAJ2 = R.raw.fmaj2;
    final static int F_MAJ3 = R.raw.fmaj3;
    //final static List<Integer> F_MAJ = Arrays.asList(F_MAJ1, F_MAJ2, F_MAJ3);
    final static int[] F_MAJ = {F_MAJ1, F_MAJ2, F_MAJ3};

    final static int G_MAJ1 = R.raw.gmaj1;
    final static int G_MAJ2 = R.raw.gmaj2;
    final static int G_MAJ3 = R.raw.gmaj3;
    //final static List<Integer> G_MAJ = Arrays.asList(G_MAJ1, G_MAJ2, G_MAJ3);
    final static int[] G_MAJ = {G_MAJ1, G_MAJ2, G_MAJ3};

    final static int A_MIN1 = R.raw.amin1;
    final static int A_MIN2 = R.raw.amin2;
    final static int A_MIN3 = R.raw.amin3;
    //final static List<Integer> A_MIN = Arrays.asList(A_MIN1, A_MIN2, A_MIN3);
    final static int[] A_MIN = {A_MIN1, A_MIN2, A_MIN3};

    final static int B_DIM1 = R.raw.bdim1;
    final static int B_DIM2 = R.raw.bdim2;
    final static int B_DIM3 = R.raw.bdim3;
    //final static List<Integer> B_DIM = Arrays.asList(B_DIM1, B_DIM2, B_DIM3);
    final static int[] B_DIM = {B_DIM1, B_DIM2, B_DIM3};

    final static List<int[]> MELODIES = Arrays.asList(C_MAJ, D_MIN, E_MIN, F_MAJ, G_MAJ, A_MIN, B_DIM);

    final static int WARM1 = R.raw.warm1;
    final static int WARM2 = R.raw.warm2;
    final static int WARM3 = R.raw.warm3;
    //final static List<Integer> C_MAJ = Arrays.asList(C_MAJ1, C_MAJ2, C_MAJ3);
    final static int[] WARM = {WARM1, WARM2, WARM3};

    final static int UPBEAT1 = R.raw.upbeat1;
    final static int UPBEAT2 = R.raw.upbeat2;
    final static int UPBEAT3 = R.raw.upbeat3;
    //final static List<Integer> C_MAJ = Arrays.asList(C_MAJ1, C_MAJ2, C_MAJ3);
    final static int[] UPBEAT = {UPBEAT1, UPBEAT2, UPBEAT3};

    final static int LIVE1 = R.raw.live1;
    final static int LIVE2 = R.raw.live2;
    final static int LIVE3 = R.raw.live3;
    //final static List<Integer> C_MAJ = Arrays.asList(C_MAJ1, C_MAJ2, C_MAJ3);
    final static int[] LIVE = {LIVE1, LIVE2, LIVE3};

    final static int CYCLE1 = R.raw.cycle1;
    final static int CYCLE2 = R.raw.cycle2;
    final static int CYCLE3 = R.raw.cycle3;
    //final static List<Integer> C_MAJ = Arrays.asList(C_MAJ1, C_MAJ2, C_MAJ3);
    final static int[] CYCLE = {CYCLE1, CYCLE2, CYCLE3};


    final static List<int[]> MELODIES_WARM = Arrays.asList(WARM, UPBEAT, LIVE, CYCLE, G_MAJ, C_MAJ, F_MAJ);
}

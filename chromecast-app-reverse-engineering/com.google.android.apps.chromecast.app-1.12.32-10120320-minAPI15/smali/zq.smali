.class public final Lzq;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public a:I

.field public b:I

.field public c:Llr;

.field public d:Landroid/view/animation/Interpolator;

.field public final synthetic e:Landroid/support/v7/widget/RecyclerView;

.field private f:Z

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/RecyclerView;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 3746
    iput-object p1, p0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3737
    invoke-static {}, Landroid/support/v7/widget/RecyclerView;->i()Landroid/view/animation/Interpolator;

    move-result-object v0

    iput-object v0, p0, Lzq;->d:Landroid/view/animation/Interpolator;

    .line 3741
    iput-boolean v1, p0, Lzq;->f:Z

    .line 3744
    iput-boolean v1, p0, Lzq;->g:Z

    .line 3747
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Landroid/support/v7/widget/RecyclerView;->i()Landroid/view/animation/Interpolator;

    move-result-object v1

    invoke-static {v0, v1}, Llr;->a(Landroid/content/Context;Landroid/view/animation/Interpolator;)Llr;

    move-result-object v0

    iput-object v0, p0, Lzq;->c:Llr;

    .line 3748
    return-void
.end method

.method public static a(F)F
    .locals 4

    .prologue
    .line 3916
    const/high16 v0, 0x3f000000    # 0.5f

    sub-float v0, p0, v0

    .line 3917
    float-to-double v0, v0

    const-wide v2, 0x3fde28c7460698c7L    # 0.4712389167638204

    mul-double/2addr v0, v2

    double-to-float v0, v0

    .line 3918
    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 3891
    iget-boolean v0, p0, Lzq;->f:Z

    if-eqz v0, :cond_0

    .line 3892
    const/4 v0, 0x1

    iput-boolean v0, p0, Lzq;->g:Z

    .line 3897
    :goto_0
    return-void

    .line 3894
    :cond_0
    iget-object v0, p0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/RecyclerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 3895
    iget-object v0, p0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0, p0}, Lgt;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final run()V
    .locals 18

    .prologue
    .line 3752
    .line 4879
    const/4 v1, 0x0

    move-object/from16 v0, p0

    iput-boolean v1, v0, Lzq;->g:Z

    .line 4880
    const/4 v1, 0x1

    move-object/from16 v0, p0

    iput-boolean v1, v0, Lzq;->f:Z

    .line 3753
    move-object/from16 v0, p0

    iget-object v1, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)V

    .line 3756
    move-object/from16 v0, p0

    iget-object v8, v0, Lzq;->c:Llr;

    .line 3757
    move-object/from16 v0, p0

    iget-object v1, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->d(Landroid/support/v7/widget/RecyclerView;)Lzh;

    .line 3758
    invoke-virtual {v8}, Llr;->e()Z

    move-result v1

    if-eqz v1, :cond_17

    .line 3759
    invoke-virtual {v8}, Llr;->a()I

    move-result v9

    .line 3760
    invoke-virtual {v8}, Llr;->b()I

    move-result v10

    .line 3761
    move-object/from16 v0, p0

    iget v1, v0, Lzq;->a:I

    sub-int v11, v9, v1

    .line 3762
    move-object/from16 v0, p0

    iget v1, v0, Lzq;->b:I

    sub-int v12, v10, v1

    .line 3763
    const/4 v4, 0x0

    .line 3764
    const/4 v2, 0x0

    .line 3765
    move-object/from16 v0, p0

    iput v9, v0, Lzq;->a:I

    .line 3766
    move-object/from16 v0, p0

    iput v10, v0, Lzq;->b:I

    .line 3767
    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 3768
    move-object/from16 v0, p0

    iget-object v5, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    move-result-object v5

    if-eqz v5, :cond_5

    .line 3769
    move-object/from16 v0, p0

    iget-object v5, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v5}, Landroid/support/v7/widget/RecyclerView;->a()V

    .line 3770
    move-object/from16 v0, p0

    iget-object v5, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)V

    .line 3771
    const-string v5, "RV Scroll"

    invoke-static {v5}, La;->a(Ljava/lang/String;)V

    .line 3772
    if-eqz v11, :cond_0

    .line 3773
    move-object/from16 v0, p0

    iget-object v3, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->d(Landroid/support/v7/widget/RecyclerView;)Lzh;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v4, v4, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    move-object/from16 v0, p0

    iget-object v5, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v5, v5, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v3, v11, v4, v5}, Lzh;->a(ILzl;Lzp;)I

    move-result v4

    .line 3774
    sub-int v3, v11, v4

    .line 3776
    :cond_0
    if-eqz v12, :cond_1

    .line 3777
    move-object/from16 v0, p0

    iget-object v1, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->d(Landroid/support/v7/widget/RecyclerView;)Lzh;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    move-object/from16 v0, p0

    iget-object v5, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v5, v5, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v1, v12, v2, v5}, Lzh;->b(ILzl;Lzp;)I

    move-result v2

    .line 3778
    sub-int v1, v12, v2

    .line 3780
    :cond_1
    invoke-static {}, La;->b()V

    .line 3781
    move-object/from16 v0, p0

    iget-object v5, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->h(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 3783
    move-object/from16 v0, p0

    iget-object v5, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v5, v5, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v5}, Lxb;->a()I

    move-result v6

    .line 3784
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v6, :cond_4

    .line 3785
    move-object/from16 v0, p0

    iget-object v7, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v7, v7, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v7, v5}, Lxb;->b(I)Landroid/view/View;

    move-result-object v7

    .line 3786
    move-object/from16 v0, p0

    iget-object v13, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v13, v7}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/View;)Lzr;

    move-result-object v13

    .line 3787
    if-eqz v13, :cond_3

    iget-object v14, v13, Lzr;->h:Lzr;

    if-eqz v14, :cond_3

    .line 3788
    iget-object v13, v13, Lzr;->h:Lzr;

    iget-object v13, v13, Lzr;->a:Landroid/view/View;

    .line 3789
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v14

    .line 3790
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v7

    .line 3791
    invoke-virtual {v13}, Landroid/view/View;->getLeft()I

    move-result v15

    if-ne v14, v15, :cond_2

    invoke-virtual {v13}, Landroid/view/View;->getTop()I

    move-result v15

    if-eq v7, v15, :cond_3

    .line 3793
    :cond_2
    invoke-virtual {v13}, Landroid/view/View;->getWidth()I

    move-result v15

    add-int/2addr v15, v14

    invoke-virtual {v13}, Landroid/view/View;->getHeight()I

    move-result v16

    add-int v16, v16, v7

    move/from16 v0, v16

    invoke-virtual {v13, v14, v7, v15, v0}, Landroid/view/View;->layout(IIII)V

    .line 3784
    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 3800
    :cond_4
    move-object/from16 v0, p0

    iget-object v5, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->i(Landroid/support/v7/widget/RecyclerView;)V

    .line 3801
    move-object/from16 v0, p0

    iget-object v5, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    :cond_5
    move/from16 v17, v3

    move v3, v2

    move/from16 v2, v17

    .line 3816
    move-object/from16 v0, p0

    iget-object v5, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->j(Landroid/support/v7/widget/RecyclerView;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_6

    .line 3817
    move-object/from16 v0, p0

    iget-object v5, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v5}, Landroid/support/v7/widget/RecyclerView;->invalidate()V

    .line 3819
    :cond_6
    move-object/from16 v0, p0

    iget-object v5, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Lgt;->a(Landroid/view/View;)I

    move-result v5

    const/4 v6, 0x2

    if-eq v5, v6, :cond_7

    .line 3821
    move-object/from16 v0, p0

    iget-object v5, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5, v11, v12}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView;II)V

    .line 3823
    :cond_7
    if-nez v2, :cond_8

    if-eqz v1, :cond_10

    .line 5325
    :cond_8
    iget-object v5, v8, Llr;->b:Lls;

    iget-object v6, v8, Llr;->a:Ljava/lang/Object;

    invoke-interface {v5, v6}, Lls;->d(Ljava/lang/Object;)F

    move-result v5

    .line 3824
    float-to-int v6, v5

    .line 3826
    const/4 v5, 0x0

    .line 3827
    if-eq v2, v9, :cond_23

    .line 3828
    if-gez v2, :cond_19

    neg-int v5, v6

    :goto_1
    move v7, v5

    .line 3831
    :goto_2
    const/4 v5, 0x0

    .line 3832
    if-eq v1, v10, :cond_22

    .line 3833
    if-gez v1, :cond_1b

    neg-int v6, v6

    .line 3836
    :cond_9
    :goto_3
    move-object/from16 v0, p0

    iget-object v5, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Lgt;->a(Landroid/view/View;)I

    move-result v5

    const/4 v13, 0x2

    if-eq v5, v13, :cond_d

    .line 3838
    move-object/from16 v0, p0

    iget-object v5, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    .line 5741
    if-gez v7, :cond_1c

    .line 5742
    invoke-virtual {v5}, Landroid/support/v7/widget/RecyclerView;->b()V

    .line 5743
    iget-object v13, v5, Landroid/support/v7/widget/RecyclerView;->i:Llc;

    neg-int v14, v7

    invoke-virtual {v13, v14}, Llc;->a(I)Z

    .line 5749
    :cond_a
    :goto_4
    if-gez v6, :cond_1d

    .line 5750
    invoke-virtual {v5}, Landroid/support/v7/widget/RecyclerView;->d()V

    .line 5751
    iget-object v13, v5, Landroid/support/v7/widget/RecyclerView;->j:Llc;

    neg-int v14, v6

    invoke-virtual {v13, v14}, Llc;->a(I)Z

    .line 5757
    :cond_b
    :goto_5
    if-nez v7, :cond_c

    if-eqz v6, :cond_d

    .line 5758
    :cond_c
    invoke-static {v5}, Lgt;->d(Landroid/view/View;)V

    .line 3840
    :cond_d
    if-nez v7, :cond_e

    if-eq v2, v9, :cond_e

    invoke-virtual {v8}, Llr;->c()I

    move-result v2

    if-nez v2, :cond_10

    :cond_e
    if-nez v6, :cond_f

    if-eq v1, v10, :cond_f

    invoke-virtual {v8}, Llr;->d()I

    move-result v1

    if-nez v1, :cond_10

    .line 3842
    :cond_f
    invoke-virtual {v8}, Llr;->f()V

    .line 3845
    :cond_10
    if-nez v4, :cond_11

    if-eqz v3, :cond_12

    .line 3846
    :cond_11
    move-object/from16 v0, p0

    iget-object v1, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v4, v3}, Landroid/support/v7/widget/RecyclerView;->c(II)V

    .line 3849
    :cond_12
    move-object/from16 v0, p0

    iget-object v1, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->k(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v1

    if-nez v1, :cond_13

    .line 3850
    move-object/from16 v0, p0

    iget-object v1, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView;->invalidate()V

    .line 3853
    :cond_13
    if-eqz v12, :cond_1e

    move-object/from16 v0, p0

    iget-object v1, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->d(Landroid/support/v7/widget/RecyclerView;)Lzh;

    move-result-object v1

    invoke-virtual {v1}, Lzh;->j()Z

    move-result v1

    if-eqz v1, :cond_1e

    if-ne v3, v12, :cond_1e

    const/4 v1, 0x1

    move v2, v1

    .line 3855
    :goto_6
    if-eqz v11, :cond_1f

    move-object/from16 v0, p0

    iget-object v1, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->d(Landroid/support/v7/widget/RecyclerView;)Lzh;

    move-result-object v1

    invoke-virtual {v1}, Lzh;->i()Z

    move-result v1

    if-eqz v1, :cond_1f

    if-ne v4, v11, :cond_1f

    const/4 v1, 0x1

    .line 3857
    :goto_7
    if-nez v11, :cond_14

    if-eqz v12, :cond_15

    :cond_14
    if-nez v1, :cond_15

    if-eqz v2, :cond_20

    :cond_15
    const/4 v1, 0x1

    .line 6279
    :goto_8
    iget-object v2, v8, Llr;->b:Lls;

    iget-object v3, v8, Llr;->a:Ljava/lang/Object;

    invoke-interface {v2, v3}, Lls;->a(Ljava/lang/Object;)Z

    move-result v2

    .line 3860
    if-nez v2, :cond_16

    if-nez v1, :cond_21

    .line 3861
    :cond_16
    move-object/from16 v0, p0

    iget-object v1, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/RecyclerView;I)V

    .line 6884
    :cond_17
    :goto_9
    const/4 v1, 0x0

    move-object/from16 v0, p0

    iput-boolean v1, v0, Lzq;->f:Z

    .line 6885
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lzq;->g:Z

    if-eqz v1, :cond_18

    .line 6886
    invoke-virtual/range {p0 .. p0}, Lzq;->a()V

    .line 3876
    :cond_18
    return-void

    .line 3828
    :cond_19
    if-lez v2, :cond_1a

    move v5, v6

    goto/16 :goto_1

    :cond_1a
    const/4 v5, 0x0

    goto/16 :goto_1

    .line 3833
    :cond_1b
    if-gtz v1, :cond_9

    const/4 v6, 0x0

    goto/16 :goto_3

    .line 5744
    :cond_1c
    if-lez v7, :cond_a

    .line 5745
    invoke-virtual {v5}, Landroid/support/v7/widget/RecyclerView;->c()V

    .line 5746
    iget-object v13, v5, Landroid/support/v7/widget/RecyclerView;->k:Llc;

    invoke-virtual {v13, v7}, Llc;->a(I)Z

    goto/16 :goto_4

    .line 5752
    :cond_1d
    if-lez v6, :cond_b

    .line 5753
    invoke-virtual {v5}, Landroid/support/v7/widget/RecyclerView;->e()V

    .line 5754
    iget-object v13, v5, Landroid/support/v7/widget/RecyclerView;->l:Llc;

    invoke-virtual {v13, v6}, Llc;->a(I)Z

    goto/16 :goto_5

    .line 3853
    :cond_1e
    const/4 v1, 0x0

    move v2, v1

    goto :goto_6

    .line 3855
    :cond_1f
    const/4 v1, 0x0

    goto :goto_7

    .line 3857
    :cond_20
    const/4 v1, 0x0

    goto :goto_8

    .line 3863
    :cond_21
    invoke-virtual/range {p0 .. p0}, Lzq;->a()V

    goto :goto_9

    :cond_22
    move v6, v5

    goto/16 :goto_3

    :cond_23
    move v7, v5

    goto/16 :goto_2
.end method

.class public Lxu;
.super Landroid/view/ViewGroup;
.source "PG"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:F

.field public g:Z

.field public h:I

.field private i:Z

.field private j:[I

.field private k:[I

.field private l:Landroid/graphics/drawable/Drawable;

.field private m:I

.field private n:I

.field private o:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 142
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lxu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 143
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 146
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lxu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 147
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v6, -0x1

    const/4 v1, 0x0

    .line 150
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 97
    iput-boolean v0, p0, Lxu;->g:Z

    .line 106
    iput v6, p0, Lxu;->a:I

    .line 113
    iput v1, p0, Lxu;->b:I

    .line 117
    const v2, 0x800033

    iput v2, p0, Lxu;->d:I

    .line 152
    sget-object v2, Loq;->aa:[I

    invoke-static {p1, p2, v2, p3, v1}, Lth;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lth;

    move-result-object v2

    .line 155
    sget v3, Loq;->ae:I

    invoke-virtual {v2, v3, v6}, Lth;->a(II)I

    move-result v3

    .line 156
    if-ltz v3, :cond_0

    .line 2650
    iget v4, p0, Lxu;->c:I

    if-eq v4, v3, :cond_0

    .line 2651
    iput v3, p0, Lxu;->c:I

    .line 2652
    invoke-virtual {p0}, Lxu;->requestLayout()V

    .line 160
    :cond_0
    sget v3, Loq;->ad:I

    invoke-virtual {v2, v3, v6}, Lth;->a(II)I

    move-result v3

    .line 161
    if-ltz v3, :cond_1

    .line 162
    invoke-virtual {p0, v3}, Lxu;->b(I)V

    .line 165
    :cond_1
    sget v3, Loq;->ab:I

    invoke-virtual {v2, v3, v0}, Lth;->a(IZ)Z

    move-result v3

    .line 166
    if-nez v3, :cond_2

    .line 3388
    iput-boolean v3, p0, Lxu;->g:Z

    .line 170
    :cond_2
    sget v3, Loq;->af:I

    .line 4115
    iget-object v4, v2, Lth;->a:Landroid/content/res/TypedArray;

    const/high16 v5, -0x40800000    # -1.0f

    invoke-virtual {v4, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    .line 170
    iput v3, p0, Lxu;->f:F

    .line 172
    sget v3, Loq;->ac:I

    invoke-virtual {v2, v3, v6}, Lth;->a(II)I

    move-result v3

    iput v3, p0, Lxu;->a:I

    .line 175
    sget v3, Loq;->ai:I

    invoke-virtual {v2, v3, v1}, Lth;->a(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lxu;->i:Z

    .line 177
    sget v3, Loq;->ag:I

    invoke-virtual {v2, v3}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 4229
    iget-object v4, p0, Lxu;->l:Landroid/graphics/drawable/Drawable;

    if-eq v3, v4, :cond_3

    .line 4232
    iput-object v3, p0, Lxu;->l:Landroid/graphics/drawable/Drawable;

    .line 4233
    if-eqz v3, :cond_4

    .line 4234
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    iput v4, p0, Lxu;->h:I

    .line 4235
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    iput v4, p0, Lxu;->m:I

    .line 4240
    :goto_0
    if-nez v3, :cond_5

    :goto_1
    invoke-virtual {p0, v0}, Lxu;->setWillNotDraw(Z)V

    .line 4241
    invoke-virtual {p0}, Lxu;->requestLayout()V

    .line 178
    :cond_3
    sget v0, Loq;->aj:I

    invoke-virtual {v2, v0, v1}, Lth;->a(II)I

    move-result v0

    iput v0, p0, Lxu;->n:I

    .line 179
    sget v0, Loq;->ah:I

    invoke-virtual {v2, v0, v1}, Lth;->c(II)I

    move-result v0

    iput v0, p0, Lxu;->o:I

    .line 5183
    iget-object v0, v2, Lth;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 182
    return-void

    .line 4237
    :cond_4
    iput v1, p0, Lxu;->h:I

    .line 4238
    iput v1, p0, Lxu;->m:I

    goto :goto_0

    :cond_5
    move v0, v1

    .line 4240
    goto :goto_1
.end method

.method private a(II)V
    .locals 9

    .prologue
    const/4 v3, 0x0

    .line 890
    invoke-virtual {p0}, Lxu;->getMeasuredWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    move v7, v3

    .line 892
    :goto_0
    if-ge v7, p1, :cond_1

    .line 16501
    invoke-virtual {p0, v7}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 894
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v4, 0x8

    if-eq v0, v4, :cond_0

    .line 895
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lxv;

    .line 897
    iget v0, v6, Lxv;->width:I

    const/4 v4, -0x1

    if-ne v0, v4, :cond_0

    .line 900
    iget v8, v6, Lxv;->height:I

    .line 901
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iput v0, v6, Lxv;->height:I

    move-object v0, p0

    move v4, p2

    move v5, v3

    .line 904
    invoke-virtual/range {v0 .. v5}, Lxu;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 905
    iput v8, v6, Lxv;->height:I

    .line 892
    :cond_0
    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_0

    .line 909
    :cond_1
    return-void
.end method

.method private a(Landroid/graphics/Canvas;I)V
    .locals 4

    .prologue
    .line 359
    iget-object v0, p0, Lxu;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lxu;->getPaddingLeft()I

    move-result v1

    iget v2, p0, Lxu;->o:I

    add-int/2addr v1, v2

    invoke-virtual {p0}, Lxu;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Lxu;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, Lxu;->o:I

    sub-int/2addr v2, v3

    iget v3, p0, Lxu;->m:I

    add-int/2addr v3, p2

    invoke-virtual {v0, v1, p2, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 361
    iget-object v0, p0, Lxu;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 362
    return-void
.end method

.method private a(Landroid/view/View;IIII)V
    .locals 0

    .prologue
    .line 1373
    invoke-virtual/range {p0 .. p5}, Lxu;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 1375
    return-void
.end method

.method private a(I)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 561
    if-nez p1, :cond_2

    .line 562
    iget v2, p0, Lxu;->n:I

    and-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    .line 575
    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    .line 562
    goto :goto_0

    .line 563
    :cond_2
    invoke-virtual {p0}, Lxu;->getChildCount()I

    move-result v2

    if-ne p1, v2, :cond_3

    .line 564
    iget v2, p0, Lxu;->n:I

    and-int/lit8 v2, v2, 0x4

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0

    .line 565
    :cond_3
    iget v2, p0, Lxu;->n:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_4

    .line 567
    add-int/lit8 v2, p1, -0x1

    :goto_1
    if-ltz v2, :cond_5

    .line 568
    invoke-virtual {p0, v2}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v4, 0x8

    if-ne v3, v4, :cond_0

    .line 567
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_4
    move v0, v1

    .line 575
    goto :goto_0

    :cond_5
    move v0, v1

    goto :goto_0
.end method

.method private b(II)V
    .locals 29

    .prologue
    .line 923
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput v2, v0, Lxu;->e:I

    .line 924
    const/16 v18, 0x0

    .line 925
    const/16 v17, 0x0

    .line 926
    const/16 v16, 0x0

    .line 927
    const/4 v15, 0x0

    .line 928
    const/4 v14, 0x1

    .line 929
    const/4 v4, 0x0

    .line 16514
    invoke-virtual/range {p0 .. p0}, Lxu;->getChildCount()I

    move-result v21

    .line 933
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v22

    .line 934
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v23

    .line 936
    const/4 v10, 0x0

    .line 937
    const/4 v12, 0x0

    .line 939
    move-object/from16 v0, p0

    iget-object v2, v0, Lxu;->j:[I

    if-eqz v2, :cond_0

    move-object/from16 v0, p0

    iget-object v2, v0, Lxu;->k:[I

    if-nez v2, :cond_1

    .line 940
    :cond_0
    const/4 v2, 0x4

    new-array v2, v2, [I

    move-object/from16 v0, p0

    iput-object v2, v0, Lxu;->j:[I

    .line 941
    const/4 v2, 0x4

    new-array v2, v2, [I

    move-object/from16 v0, p0

    iput-object v2, v0, Lxu;->k:[I

    .line 944
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lxu;->j:[I

    move-object/from16 v24, v0

    .line 945
    move-object/from16 v0, p0

    iget-object v0, v0, Lxu;->k:[I

    move-object/from16 v25, v0

    .line 947
    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x3

    const/4 v7, -0x1

    aput v7, v24, v6

    aput v7, v24, v5

    aput v7, v24, v3

    aput v7, v24, v2

    .line 948
    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x3

    const/4 v7, -0x1

    aput v7, v25, v6

    aput v7, v25, v5

    aput v7, v25, v3

    aput v7, v25, v2

    .line 950
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lxu;->g:Z

    move/from16 v26, v0

    .line 951
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lxu;->i:Z

    move/from16 v27, v0

    .line 953
    const/high16 v2, 0x40000000    # 2.0f

    move/from16 v0, v22

    if-ne v0, v2, :cond_2

    const/4 v2, 0x1

    move v9, v2

    .line 955
    :goto_0
    const/high16 v11, -0x80000000

    .line 958
    const/16 v19, 0x0

    :goto_1
    move/from16 v0, v19

    move/from16 v1, v21

    if-ge v0, v1, :cond_12

    .line 17501
    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 961
    if-nez v3, :cond_3

    .line 962
    move-object/from16 v0, p0

    iget v2, v0, Lxu;->e:I

    move-object/from16 v0, p0

    iput v2, v0, Lxu;->e:I

    move/from16 v2, v19

    .line 958
    :goto_2
    add-int/lit8 v19, v2, 0x1

    goto :goto_1

    .line 953
    :cond_2
    const/4 v2, 0x0

    move v9, v2

    goto :goto_0

    .line 966
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v5, 0x8

    if-eq v2, v5, :cond_34

    .line 971
    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-direct {v0, v1}, Lxu;->a(I)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 972
    move-object/from16 v0, p0

    iget v2, v0, Lxu;->e:I

    move-object/from16 v0, p0

    iget v5, v0, Lxu;->h:I

    add-int/2addr v2, v5

    move-object/from16 v0, p0

    iput v2, v0, Lxu;->e:I

    .line 975
    :cond_4
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lxv;

    .line 978
    iget v2, v8, Lxv;->g:F

    add-float v13, v4, v2

    .line 980
    const/high16 v2, 0x40000000    # 2.0f

    move/from16 v0, v22

    if-ne v0, v2, :cond_8

    iget v2, v8, Lxv;->width:I

    if-nez v2, :cond_8

    iget v2, v8, Lxv;->g:F

    const/4 v4, 0x0

    cmpl-float v2, v2, v4

    if-lez v2, :cond_8

    .line 984
    if-eqz v9, :cond_6

    .line 985
    move-object/from16 v0, p0

    iget v2, v0, Lxu;->e:I

    iget v4, v8, Lxv;->leftMargin:I

    iget v5, v8, Lxv;->rightMargin:I

    add-int/2addr v4, v5

    add-int/2addr v2, v4

    move-object/from16 v0, p0

    iput v2, v0, Lxu;->e:I

    .line 997
    :goto_3
    if-eqz v26, :cond_7

    .line 998
    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 999
    invoke-virtual {v3, v2, v2}, Landroid/view/View;->measure(II)V

    move v7, v11

    move v11, v12

    .line 1042
    :goto_4
    const/4 v2, 0x0

    .line 1043
    const/high16 v4, 0x40000000    # 2.0f

    move/from16 v0, v23

    if-eq v0, v4, :cond_32

    iget v4, v8, Lxv;->height:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_32

    .line 1047
    const/4 v4, 0x1

    .line 1048
    const/4 v2, 0x1

    .line 1051
    :goto_5
    iget v5, v8, Lxv;->topMargin:I

    iget v6, v8, Lxv;->bottomMargin:I

    add-int/2addr v5, v6

    .line 1052
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    add-int/2addr v6, v5

    .line 1053
    invoke-static {v3}, Lgt;->j(Landroid/view/View;)I

    move-result v10

    move/from16 v0, v17

    invoke-static {v0, v10}, Ltm;->a(II)I

    move-result v10

    .line 1056
    if-eqz v26, :cond_5

    .line 1057
    invoke-virtual {v3}, Landroid/view/View;->getBaseline()I

    move-result v12

    .line 1058
    const/4 v3, -0x1

    if-eq v12, v3, :cond_5

    .line 1061
    iget v3, v8, Lxv;->h:I

    if-gez v3, :cond_d

    move-object/from16 v0, p0

    iget v3, v0, Lxu;->d:I

    :goto_6
    and-int/lit8 v3, v3, 0x70

    .line 1063
    shr-int/lit8 v3, v3, 0x4

    and-int/lit8 v3, v3, -0x2

    shr-int/lit8 v3, v3, 0x1

    .line 1066
    aget v17, v24, v3

    move/from16 v0, v17

    invoke-static {v0, v12}, Ljava/lang/Math;->max(II)I

    move-result v17

    aput v17, v24, v3

    .line 1067
    aget v17, v25, v3

    sub-int v12, v6, v12

    move/from16 v0, v17

    invoke-static {v0, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    aput v12, v25, v3

    .line 1071
    :cond_5
    move/from16 v0, v18

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v12

    .line 1073
    if-eqz v14, :cond_e

    iget v3, v8, Lxv;->height:I

    const/4 v14, -0x1

    if-ne v3, v14, :cond_e

    const/4 v3, 0x1

    .line 1074
    :goto_7
    iget v8, v8, Lxv;->g:F

    const/4 v14, 0x0

    cmpl-float v8, v8, v14

    if-lez v8, :cond_10

    .line 1079
    if-eqz v2, :cond_f

    move v2, v5

    :goto_8
    invoke-static {v15, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    move v5, v13

    move v6, v3

    move/from16 v8, v16

    move v3, v11

    move v11, v12

    move/from16 v28, v7

    move v7, v2

    move/from16 v2, v28

    :goto_9
    move v12, v3

    move v14, v6

    move v15, v7

    move/from16 v16, v8

    move/from16 v17, v10

    move/from16 v18, v11

    move v10, v4

    move v11, v2

    move v4, v5

    move/from16 v2, v19

    .line 1086
    goto/16 :goto_2

    .line 987
    :cond_6
    move-object/from16 v0, p0

    iget v2, v0, Lxu;->e:I

    .line 988
    iget v4, v8, Lxv;->leftMargin:I

    add-int/2addr v4, v2

    iget v5, v8, Lxv;->rightMargin:I

    add-int/2addr v4, v5

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lxu;->e:I

    goto/16 :goto_3

    .line 1001
    :cond_7
    const/4 v12, 0x1

    move v7, v11

    move v11, v12

    goto/16 :goto_4

    .line 1004
    :cond_8
    const/high16 v2, -0x80000000

    .line 1006
    iget v4, v8, Lxv;->width:I

    if-nez v4, :cond_9

    iget v4, v8, Lxv;->g:F

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    if-lez v4, :cond_9

    .line 1011
    const/4 v2, 0x0

    .line 1012
    const/4 v4, -0x2

    iput v4, v8, Lxv;->width:I

    :cond_9
    move/from16 v20, v2

    .line 1019
    const/4 v2, 0x0

    cmpl-float v2, v13, v2

    if-nez v2, :cond_b

    move-object/from16 v0, p0

    iget v5, v0, Lxu;->e:I

    :goto_a
    const/4 v7, 0x0

    move-object/from16 v2, p0

    move/from16 v4, p1

    move/from16 v6, p2

    invoke-direct/range {v2 .. v7}, Lxu;->a(Landroid/view/View;IIII)V

    .line 1023
    const/high16 v2, -0x80000000

    move/from16 v0, v20

    if-eq v0, v2, :cond_a

    .line 1024
    move/from16 v0, v20

    iput v0, v8, Lxv;->width:I

    .line 1027
    :cond_a
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 1028
    if-eqz v9, :cond_c

    .line 1029
    move-object/from16 v0, p0

    iget v4, v0, Lxu;->e:I

    iget v5, v8, Lxv;->leftMargin:I

    add-int/2addr v5, v2

    iget v6, v8, Lxv;->rightMargin:I

    add-int/2addr v5, v6

    add-int/2addr v4, v5

    move-object/from16 v0, p0

    iput v4, v0, Lxu;->e:I

    .line 1037
    :goto_b
    if-eqz v27, :cond_33

    .line 1038
    invoke-static {v2, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    move v7, v11

    move v11, v12

    goto/16 :goto_4

    .line 1019
    :cond_b
    const/4 v5, 0x0

    goto :goto_a

    .line 1032
    :cond_c
    move-object/from16 v0, p0

    iget v4, v0, Lxu;->e:I

    .line 1033
    add-int v5, v4, v2

    iget v6, v8, Lxv;->leftMargin:I

    add-int/2addr v5, v6

    iget v6, v8, Lxv;->rightMargin:I

    add-int/2addr v5, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    move-object/from16 v0, p0

    iput v4, v0, Lxu;->e:I

    goto :goto_b

    .line 1061
    :cond_d
    iget v3, v8, Lxv;->h:I

    goto/16 :goto_6

    .line 1073
    :cond_e
    const/4 v3, 0x0

    goto/16 :goto_7

    :cond_f
    move v2, v6

    .line 1079
    goto/16 :goto_8

    .line 1082
    :cond_10
    if-eqz v2, :cond_11

    :goto_c
    move/from16 v0, v16

    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    move v5, v13

    move v6, v3

    move v8, v2

    move v3, v11

    move v2, v7

    move v7, v15

    move v11, v12

    goto/16 :goto_9

    :cond_11
    move v5, v6

    goto :goto_c

    .line 1089
    :cond_12
    move-object/from16 v0, p0

    iget v2, v0, Lxu;->e:I

    if-lez v2, :cond_13

    move-object/from16 v0, p0

    move/from16 v1, v21

    invoke-direct {v0, v1}, Lxu;->a(I)Z

    move-result v2

    if-eqz v2, :cond_13

    .line 1090
    move-object/from16 v0, p0

    iget v2, v0, Lxu;->e:I

    move-object/from16 v0, p0

    iget v3, v0, Lxu;->h:I

    add-int/2addr v2, v3

    move-object/from16 v0, p0

    iput v2, v0, Lxu;->e:I

    .line 1095
    :cond_13
    const/4 v2, 0x1

    aget v2, v24, v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_14

    const/4 v2, 0x0

    aget v2, v24, v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_14

    const/4 v2, 0x2

    aget v2, v24, v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_14

    const/4 v2, 0x3

    aget v2, v24, v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_31

    .line 1099
    :cond_14
    const/4 v2, 0x3

    aget v2, v24, v2

    const/4 v3, 0x0

    aget v3, v24, v3

    const/4 v5, 0x1

    aget v5, v24, v5

    const/4 v6, 0x2

    aget v6, v24, v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 1102
    const/4 v3, 0x3

    aget v3, v25, v3

    const/4 v5, 0x0

    aget v5, v25, v5

    const/4 v6, 0x1

    aget v6, v25, v6

    const/4 v7, 0x2

    aget v7, v25, v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 1105
    add-int/2addr v2, v3

    move/from16 v0, v18

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 1108
    :goto_d
    if-eqz v27, :cond_19

    const/high16 v2, -0x80000000

    move/from16 v0, v22

    if-eq v0, v2, :cond_15

    if-nez v22, :cond_19

    .line 1110
    :cond_15
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput v2, v0, Lxu;->e:I

    .line 1112
    const/4 v3, 0x0

    :goto_e
    move/from16 v0, v21

    if-ge v3, v0, :cond_19

    .line 18501
    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1115
    if-nez v2, :cond_16

    .line 1116
    move-object/from16 v0, p0

    iget v2, v0, Lxu;->e:I

    move-object/from16 v0, p0

    iput v2, v0, Lxu;->e:I

    move v2, v3

    .line 1112
    :goto_f
    add-int/lit8 v3, v2, 0x1

    goto :goto_e

    .line 1120
    :cond_16
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v6

    const/16 v7, 0x8

    if-ne v6, v7, :cond_17

    move v2, v3

    .line 1122
    goto :goto_f

    .line 1125
    :cond_17
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Lxv;

    .line 1127
    if-eqz v9, :cond_18

    .line 1128
    move-object/from16 v0, p0

    iget v6, v0, Lxu;->e:I

    iget v7, v2, Lxv;->leftMargin:I

    add-int/2addr v7, v11

    iget v2, v2, Lxv;->rightMargin:I

    add-int/2addr v2, v7

    add-int/2addr v2, v6

    move-object/from16 v0, p0

    iput v2, v0, Lxu;->e:I

    move v2, v3

    goto :goto_f

    .line 1131
    :cond_18
    move-object/from16 v0, p0

    iget v6, v0, Lxu;->e:I

    .line 1132
    add-int v7, v6, v11

    iget v8, v2, Lxv;->leftMargin:I

    add-int/2addr v7, v8

    iget v2, v2, Lxv;->rightMargin:I

    add-int/2addr v2, v7

    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lxu;->e:I

    move v2, v3

    goto :goto_f

    .line 1139
    :cond_19
    move-object/from16 v0, p0

    iget v2, v0, Lxu;->e:I

    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingLeft()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingRight()I

    move-result v6

    add-int/2addr v3, v6

    add-int/2addr v2, v3

    move-object/from16 v0, p0

    iput v2, v0, Lxu;->e:I

    .line 1141
    move-object/from16 v0, p0

    iget v2, v0, Lxu;->e:I

    .line 1144
    invoke-virtual/range {p0 .. p0}, Lxu;->getSuggestedMinimumWidth()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 1147
    const/4 v3, 0x0

    move/from16 v0, p1

    invoke-static {v2, v0, v3}, Lgt;->a(III)I

    move-result v18

    .line 1148
    const v2, 0xffffff

    and-int v2, v2, v18

    .line 1153
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->e:I

    sub-int v6, v2, v3

    .line 1154
    if-nez v12, :cond_1a

    if-eqz v6, :cond_2a

    const/4 v2, 0x0

    cmpl-float v2, v4, v2

    if-lez v2, :cond_2a

    .line 1155
    :cond_1a
    move-object/from16 v0, p0

    iget v2, v0, Lxu;->f:F

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_1b

    move-object/from16 v0, p0

    iget v4, v0, Lxu;->f:F

    .line 1157
    :cond_1b
    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x2

    const/4 v7, 0x3

    const/4 v8, -0x1

    aput v8, v24, v7

    aput v8, v24, v5

    aput v8, v24, v3

    aput v8, v24, v2

    .line 1158
    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x2

    const/4 v7, 0x3

    const/4 v8, -0x1

    aput v8, v25, v7

    aput v8, v25, v5

    aput v8, v25, v3

    aput v8, v25, v2

    .line 1159
    const/4 v7, -0x1

    .line 1161
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput v2, v0, Lxu;->e:I

    .line 1163
    const/4 v2, 0x0

    move v15, v2

    move v11, v14

    move/from16 v12, v16

    move v14, v7

    move/from16 v7, v17

    :goto_10
    move/from16 v0, v21

    if-ge v15, v0, :cond_26

    .line 19501
    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 1166
    if-eqz v5, :cond_30

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_30

    .line 1170
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Lxv;

    .line 1173
    iget v8, v2, Lxv;->g:F

    .line 1174
    const/4 v3, 0x0

    cmpl-float v3, v8, v3

    if-lez v3, :cond_2f

    .line 1176
    int-to-float v3, v6

    mul-float/2addr v3, v8

    div-float/2addr v3, v4

    float-to-int v3, v3

    .line 1177
    sub-float v8, v4, v8

    .line 1178
    sub-int/2addr v6, v3

    .line 1180
    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingTop()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingBottom()I

    move-result v13

    add-int/2addr v4, v13

    iget v13, v2, Lxv;->topMargin:I

    add-int/2addr v4, v13

    iget v13, v2, Lxv;->bottomMargin:I

    add-int/2addr v4, v13

    iget v13, v2, Lxv;->height:I

    move/from16 v0, p2

    invoke-static {v0, v4, v13}, Lxu;->getChildMeasureSpec(III)I

    move-result v13

    .line 1187
    iget v4, v2, Lxv;->width:I

    if-nez v4, :cond_1c

    const/high16 v4, 0x40000000    # 2.0f

    move/from16 v0, v22

    if-eq v0, v4, :cond_1f

    .line 1190
    :cond_1c
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    add-int/2addr v3, v4

    .line 1191
    if-gez v3, :cond_1d

    .line 1192
    const/4 v3, 0x0

    :cond_1d
    move-object v4, v5

    .line 1200
    :goto_11
    const/high16 v16, 0x40000000    # 2.0f

    move/from16 v0, v16

    invoke-static {v3, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {v4, v3, v13}, Landroid/view/View;->measure(II)V

    .line 1206
    invoke-static {v5}, Lgt;->j(Landroid/view/View;)I

    move-result v3

    const/high16 v4, -0x1000000

    and-int/2addr v3, v4

    invoke-static {v7, v3}, Ltm;->a(II)I

    move-result v13

    move v7, v8

    move v8, v6

    .line 1210
    :goto_12
    if-eqz v9, :cond_21

    .line 1211
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->e:I

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    iget v6, v2, Lxv;->leftMargin:I

    add-int/2addr v4, v6

    iget v6, v2, Lxv;->rightMargin:I

    add-int/2addr v4, v6

    add-int/2addr v3, v4

    move-object/from16 v0, p0

    iput v3, v0, Lxu;->e:I

    .line 1219
    :goto_13
    const/high16 v3, 0x40000000    # 2.0f

    move/from16 v0, v23

    if-eq v0, v3, :cond_22

    iget v3, v2, Lxv;->height:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_22

    const/4 v3, 0x1

    .line 1222
    :goto_14
    iget v4, v2, Lxv;->topMargin:I

    iget v6, v2, Lxv;->bottomMargin:I

    add-int/2addr v4, v6

    .line 1223
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    add-int/2addr v6, v4

    .line 1224
    invoke-static {v14, v6}, Ljava/lang/Math;->max(II)I

    move-result v14

    .line 1225
    if-eqz v3, :cond_23

    move v3, v4

    :goto_15
    invoke-static {v12, v3}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 1228
    if-eqz v11, :cond_24

    iget v3, v2, Lxv;->height:I

    const/4 v11, -0x1

    if-ne v3, v11, :cond_24

    const/4 v3, 0x1

    .line 1230
    :goto_16
    if-eqz v26, :cond_1e

    .line 1231
    invoke-virtual {v5}, Landroid/view/View;->getBaseline()I

    move-result v5

    .line 1232
    const/4 v11, -0x1

    if-eq v5, v11, :cond_1e

    .line 1234
    iget v11, v2, Lxv;->h:I

    if-gez v11, :cond_25

    move-object/from16 v0, p0

    iget v2, v0, Lxu;->d:I

    :goto_17
    and-int/lit8 v2, v2, 0x70

    .line 1236
    shr-int/lit8 v2, v2, 0x4

    and-int/lit8 v2, v2, -0x2

    shr-int/lit8 v2, v2, 0x1

    .line 1239
    aget v11, v24, v2

    invoke-static {v11, v5}, Ljava/lang/Math;->max(II)I

    move-result v11

    aput v11, v24, v2

    .line 1240
    aget v11, v25, v2

    sub-int v5, v6, v5

    invoke-static {v11, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    aput v5, v25, v2

    :cond_1e
    move v2, v7

    move v5, v4

    move v6, v13

    move v4, v3

    move v7, v14

    move v3, v8

    .line 1163
    :goto_18
    add-int/lit8 v8, v15, 0x1

    move v15, v8

    move v11, v4

    move v12, v5

    move v14, v7

    move v7, v6

    move v4, v2

    move v6, v3

    goto/16 :goto_10

    .line 1200
    :cond_1f
    if-lez v3, :cond_20

    move-object v4, v5

    goto/16 :goto_11

    :cond_20
    const/4 v3, 0x0

    move-object v4, v5

    goto/16 :goto_11

    .line 1214
    :cond_21
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->e:I

    .line 1215
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    add-int/2addr v4, v3

    iget v6, v2, Lxv;->leftMargin:I

    add-int/2addr v4, v6

    iget v6, v2, Lxv;->rightMargin:I

    add-int/2addr v4, v6

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    move-object/from16 v0, p0

    iput v3, v0, Lxu;->e:I

    goto/16 :goto_13

    .line 1219
    :cond_22
    const/4 v3, 0x0

    goto :goto_14

    :cond_23
    move v3, v6

    .line 1225
    goto :goto_15

    .line 1228
    :cond_24
    const/4 v3, 0x0

    goto :goto_16

    .line 1234
    :cond_25
    iget v2, v2, Lxv;->h:I

    goto :goto_17

    .line 1247
    :cond_26
    move-object/from16 v0, p0

    iget v2, v0, Lxu;->e:I

    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingLeft()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingRight()I

    move-result v4

    add-int/2addr v3, v4

    add-int/2addr v2, v3

    move-object/from16 v0, p0

    iput v2, v0, Lxu;->e:I

    .line 1252
    const/4 v2, 0x1

    aget v2, v24, v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_27

    const/4 v2, 0x0

    aget v2, v24, v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_27

    const/4 v2, 0x2

    aget v2, v24, v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_27

    const/4 v2, 0x3

    aget v2, v24, v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_28

    .line 1256
    :cond_27
    const/4 v2, 0x3

    aget v2, v24, v2

    const/4 v3, 0x0

    aget v3, v24, v3

    const/4 v4, 0x1

    aget v4, v24, v4

    const/4 v5, 0x2

    aget v5, v24, v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 1259
    const/4 v3, 0x3

    aget v3, v25, v3

    const/4 v4, 0x0

    aget v4, v25, v4

    const/4 v5, 0x1

    aget v5, v25, v5

    const/4 v6, 0x2

    aget v6, v25, v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 1262
    add-int/2addr v2, v3

    invoke-static {v14, v2}, Ljava/lang/Math;->max(II)I

    move-result v14

    :cond_28
    move v2, v12

    move/from16 v17, v7

    move v3, v14

    move v14, v11

    .line 1291
    :goto_19
    if-nez v14, :cond_2d

    const/high16 v4, 0x40000000    # 2.0f

    move/from16 v0, v23

    if-eq v0, v4, :cond_2d

    .line 1295
    :goto_1a
    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingTop()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingBottom()I

    move-result v4

    add-int/2addr v3, v4

    add-int/2addr v2, v3

    .line 1298
    invoke-virtual/range {p0 .. p0}, Lxu;->getSuggestedMinimumHeight()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 1300
    const/high16 v3, -0x1000000

    and-int v3, v3, v17

    or-int v3, v3, v18

    shl-int/lit8 v4, v17, 0x10

    move/from16 v0, p2

    invoke-static {v2, v0, v4}, Lgt;->a(III)I

    move-result v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v3, v2}, Lxu;->setMeasuredDimension(II)V

    .line 1304
    if-eqz v10, :cond_2c

    .line 21313
    invoke-virtual/range {p0 .. p0}, Lxu;->getMeasuredHeight()I

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    .line 21315
    const/4 v2, 0x0

    move v9, v2

    :goto_1b
    move/from16 v0, v21

    if-ge v9, v0, :cond_2c

    .line 21501
    move-object/from16 v0, p0

    invoke-virtual {v0, v9}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 21317
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v4, 0x8

    if-eq v2, v4, :cond_29

    .line 21318
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lxv;

    .line 21320
    iget v2, v8, Lxv;->height:I

    const/4 v4, -0x1

    if-ne v2, v4, :cond_29

    .line 21323
    iget v10, v8, Lxv;->width:I

    .line 21324
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    iput v2, v8, Lxv;->width:I

    .line 21327
    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object/from16 v2, p0

    move/from16 v4, p1

    invoke-virtual/range {v2 .. v7}, Lxu;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 21328
    iput v10, v8, Lxv;->width:I

    .line 21315
    :cond_29
    add-int/lit8 v2, v9, 0x1

    move v9, v2

    goto :goto_1b

    .line 1265
    :cond_2a
    move/from16 v0, v16

    invoke-static {v0, v15}, Ljava/lang/Math;->max(II)I

    move-result v12

    .line 1269
    if-eqz v27, :cond_2e

    const/high16 v2, 0x40000000    # 2.0f

    move/from16 v0, v22

    if-eq v0, v2, :cond_2e

    .line 1270
    const/4 v2, 0x0

    move v3, v2

    :goto_1c
    move/from16 v0, v21

    if-ge v3, v0, :cond_2e

    .line 20501
    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 1273
    if-eqz v4, :cond_2b

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v6, 0x8

    if-eq v2, v6, :cond_2b

    .line 1277
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Lxv;

    .line 1280
    iget v2, v2, Lxv;->g:F

    .line 1281
    const/4 v6, 0x0

    cmpl-float v2, v2, v6

    if-lez v2, :cond_2b

    .line 1282
    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v11, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    const/high16 v7, 0x40000000    # 2.0f

    invoke-static {v6, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    invoke-virtual {v4, v2, v6}, Landroid/view/View;->measure(II)V

    .line 1270
    :cond_2b
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_1c

    .line 1307
    :cond_2c
    return-void

    :cond_2d
    move v2, v3

    goto/16 :goto_1a

    :cond_2e
    move v2, v12

    move v3, v5

    goto/16 :goto_19

    :cond_2f
    move v8, v6

    move v13, v7

    move v7, v4

    goto/16 :goto_12

    :cond_30
    move v2, v4

    move v3, v6

    move v5, v12

    move v4, v11

    move v6, v7

    move v7, v14

    goto/16 :goto_18

    :cond_31
    move/from16 v5, v18

    goto/16 :goto_d

    :cond_32
    move v4, v10

    goto/16 :goto_5

    :cond_33
    move v7, v11

    move v11, v12

    goto/16 :goto_4

    :cond_34
    move v2, v11

    move v3, v12

    move v5, v4

    move v6, v14

    move v7, v15

    move/from16 v8, v16

    move v4, v10

    move/from16 v11, v18

    move/from16 v10, v17

    goto/16 :goto_9
.end method

.method private b(Landroid/graphics/Canvas;I)V
    .locals 5

    .prologue
    .line 365
    iget-object v0, p0, Lxu;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lxu;->getPaddingTop()I

    move-result v1

    iget v2, p0, Lxu;->o:I

    add-int/2addr v1, v2

    iget v2, p0, Lxu;->h:I

    add-int/2addr v2, p2

    invoke-virtual {p0}, Lxu;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Lxu;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Lxu;->o:I

    sub-int/2addr v3, v4

    invoke-virtual {v0, p2, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 367
    iget-object v0, p0, Lxu;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 368
    return-void
.end method

.method private static b(Landroid/view/View;IIII)V
    .locals 2

    .prologue
    .line 1641
    add-int v0, p1, p3

    add-int v1, p2, p4

    invoke-virtual {p0, p1, p2, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 1642
    return-void
.end method


# virtual methods
.method public a(Landroid/util/AttributeSet;)Lxv;
    .locals 2

    .prologue
    .line 1707
    new-instance v0, Lxv;

    invoke-virtual {p0}, Lxu;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lxv;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public b(Landroid/view/ViewGroup$LayoutParams;)Lxv;
    .locals 1

    .prologue
    .line 1730
    new-instance v0, Lxv;

    invoke-direct {v0, p1}, Lxv;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final b(I)V
    .locals 2

    .prologue
    .line 1675
    iget v0, p0, Lxu;->d:I

    if-eq v0, p1, :cond_1

    .line 1676
    const v0, 0x800007

    and-int/2addr v0, p1

    if-nez v0, :cond_2

    .line 1677
    const v0, 0x800003

    or-int/2addr v0, p1

    .line 1680
    :goto_0
    and-int/lit8 v1, v0, 0x70

    if-nez v1, :cond_0

    .line 1681
    or-int/lit8 v0, v0, 0x30

    .line 1684
    :cond_0
    iput v0, p0, Lxu;->d:I

    .line 1685
    invoke-virtual {p0}, Lxu;->requestLayout()V

    .line 1687
    :cond_1
    return-void

    :cond_2
    move v0, p1

    goto :goto_0
.end method

.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .prologue
    .line 1737
    instance-of v0, p1, Lxv;

    return v0
.end method

.method public d()Lxv;
    .locals 3

    .prologue
    const/4 v2, -0x2

    .line 1720
    iget v0, p0, Lxu;->c:I

    if-nez v0, :cond_0

    .line 1721
    new-instance v0, Lxv;

    invoke-direct {v0, v2, v2}, Lxv;-><init>(II)V

    .line 1725
    :goto_0
    return-object v0

    .line 1722
    :cond_0
    iget v0, p0, Lxu;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1723
    new-instance v0, Lxv;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v2}, Lxv;-><init>(II)V

    goto :goto_0

    .line 1725
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0}, Lxu;->d()Lxv;

    move-result-object v0

    return-object v0
.end method

.method public synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0, p1}, Lxu;->a(Landroid/util/AttributeSet;)Lxv;

    move-result-object v0

    return-object v0
.end method

.method public synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0, p1}, Lxu;->b(Landroid/view/ViewGroup$LayoutParams;)Lxv;

    move-result-object v0

    return-object v0
.end method

.method public getBaseline()I
    .locals 5

    .prologue
    const/4 v0, -0x1

    .line 419
    iget v1, p0, Lxu;->a:I

    if-gez v1, :cond_1

    .line 420
    invoke-super {p0}, Landroid/view/ViewGroup;->getBaseline()I

    move-result v0

    .line 467
    :cond_0
    :goto_0
    return v0

    .line 423
    :cond_1
    invoke-virtual {p0}, Lxu;->getChildCount()I

    move-result v1

    iget v2, p0, Lxu;->a:I

    if-gt v1, v2, :cond_2

    .line 424
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 428
    :cond_2
    iget v1, p0, Lxu;->a:I

    invoke-virtual {p0, v1}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 429
    invoke-virtual {v2}, Landroid/view/View;->getBaseline()I

    move-result v3

    .line 431
    if-ne v3, v0, :cond_3

    .line 432
    iget v1, p0, Lxu;->a:I

    if-eqz v1, :cond_0

    .line 438
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 448
    :cond_3
    iget v0, p0, Lxu;->b:I

    .line 450
    iget v1, p0, Lxu;->c:I

    const/4 v4, 0x1

    if-ne v1, v4, :cond_4

    .line 451
    iget v1, p0, Lxu;->d:I

    and-int/lit8 v1, v1, 0x70

    .line 452
    const/16 v4, 0x30

    if-eq v1, v4, :cond_4

    .line 453
    sparse-switch v1, :sswitch_data_0

    :cond_4
    move v1, v0

    .line 466
    :goto_1
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lxv;

    .line 467
    iget v0, v0, Lxv;->topMargin:I

    add-int/2addr v0, v1

    add-int/2addr v0, v3

    goto :goto_0

    .line 455
    :sswitch_0
    invoke-virtual {p0}, Lxu;->getBottom()I

    move-result v0

    invoke-virtual {p0}, Lxu;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lxu;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lxu;->e:I

    sub-int/2addr v0, v1

    move v1, v0

    .line 456
    goto :goto_1

    .line 459
    :sswitch_1
    invoke-virtual {p0}, Lxu;->getBottom()I

    move-result v1

    invoke-virtual {p0}, Lxu;->getTop()I

    move-result v4

    sub-int/2addr v1, v4

    invoke-virtual {p0}, Lxu;->getPaddingTop()I

    move-result v4

    sub-int/2addr v1, v4

    invoke-virtual {p0}, Lxu;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v1, v4

    iget v4, p0, Lxu;->e:I

    sub-int/2addr v1, v4

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_1

    .line 453
    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x50 -> :sswitch_0
    .end sparse-switch
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    const/16 v5, 0x8

    const/4 v0, 0x0

    .line 279
    iget-object v1, p0, Lxu;->l:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_1

    .line 288
    :cond_0
    :goto_0
    return-void

    .line 283
    :cond_1
    iget v1, p0, Lxu;->c:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_5

    .line 5514
    invoke-virtual {p0}, Lxu;->getChildCount()I

    move-result v2

    move v1, v0

    .line 5292
    :goto_1
    if-ge v1, v2, :cond_3

    .line 6501
    invoke-virtual {p0, v1}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 5295
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v5, :cond_2

    .line 5296
    invoke-direct {p0, v1}, Lxu;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5297
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lxv;

    .line 5298
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    iget v0, v0, Lxv;->topMargin:I

    sub-int v0, v3, v0

    iget v3, p0, Lxu;->m:I

    sub-int/2addr v0, v3

    .line 5299
    invoke-direct {p0, p1, v0}, Lxu;->a(Landroid/graphics/Canvas;I)V

    .line 5292
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 5304
    :cond_3
    invoke-direct {p0, v2}, Lxu;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5305
    add-int/lit8 v0, v2, -0x1

    .line 7501
    invoke-virtual {p0, v0}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 5307
    if-nez v1, :cond_4

    .line 5308
    invoke-virtual {p0}, Lxu;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lxu;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lxu;->m:I

    sub-int/2addr v0, v1

    .line 5313
    :goto_2
    invoke-direct {p0, p1, v0}, Lxu;->a(Landroid/graphics/Canvas;I)V

    goto :goto_0

    .line 5310
    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lxv;

    .line 5311
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    iget v0, v0, Lxv;->bottomMargin:I

    add-int/2addr v0, v1

    goto :goto_2

    .line 8514
    :cond_5
    invoke-virtual {p0}, Lxu;->getChildCount()I

    move-result v2

    .line 8319
    invoke-static {p0}, Ltm;->a(Landroid/view/View;)Z

    move-result v3

    move v1, v0

    .line 8320
    :goto_3
    if-ge v1, v2, :cond_8

    .line 9501
    invoke-virtual {p0, v1}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 8323
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v5, :cond_6

    .line 8324
    invoke-direct {p0, v1}, Lxu;->a(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 8325
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lxv;

    .line 8327
    if-eqz v3, :cond_7

    .line 8328
    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    move-result v4

    iget v0, v0, Lxv;->rightMargin:I

    add-int/2addr v0, v4

    .line 8332
    :goto_4
    invoke-direct {p0, p1, v0}, Lxu;->b(Landroid/graphics/Canvas;I)V

    .line 8320
    :cond_6
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    .line 8330
    :cond_7
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v4

    iget v0, v0, Lxv;->leftMargin:I

    sub-int v0, v4, v0

    iget v4, p0, Lxu;->h:I

    sub-int/2addr v0, v4

    goto :goto_4

    .line 8337
    :cond_8
    invoke-direct {p0, v2}, Lxu;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8338
    add-int/lit8 v0, v2, -0x1

    .line 10501
    invoke-virtual {p0, v0}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 8340
    if-nez v1, :cond_a

    .line 8341
    if-eqz v3, :cond_9

    .line 8342
    invoke-virtual {p0}, Lxu;->getPaddingLeft()I

    move-result v0

    .line 8354
    :goto_5
    invoke-direct {p0, p1, v0}, Lxu;->b(Landroid/graphics/Canvas;I)V

    goto/16 :goto_0

    .line 8344
    :cond_9
    invoke-virtual {p0}, Lxu;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lxu;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lxu;->h:I

    sub-int/2addr v0, v1

    goto :goto_5

    .line 8347
    :cond_a
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lxv;

    .line 8348
    if-eqz v3, :cond_b

    .line 8349
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    iget v0, v0, Lxv;->leftMargin:I

    sub-int v0, v1, v0

    iget v1, p0, Lxu;->h:I

    sub-int/2addr v0, v1

    goto :goto_5

    .line 8351
    :cond_b
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    iget v0, v0, Lxv;->rightMargin:I

    add-int/2addr v0, v1

    goto :goto_5
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .prologue
    .line 1741
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 1742
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1743
    const-class v0, Lxu;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 1745
    :cond_0
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2

    .prologue
    .line 1748
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 1749
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 1750
    const-class v0, Lxu;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 1752
    :cond_0
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 23

    .prologue
    .line 1402
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->c:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_3

    .line 22422
    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingLeft()I

    move-result v8

    .line 22428
    sub-int v3, p4, p2

    .line 22429
    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingRight()I

    move-result v4

    sub-int v9, v3, v4

    .line 22432
    sub-int/2addr v3, v8

    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingRight()I

    move-result v4

    sub-int v10, v3, v4

    .line 22514
    invoke-virtual/range {p0 .. p0}, Lxu;->getChildCount()I

    move-result v11

    .line 22436
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->d:I

    and-int/lit8 v3, v3, 0x70

    .line 22437
    move-object/from16 v0, p0

    iget v4, v0, Lxu;->d:I

    const v5, 0x800007

    and-int/2addr v5, v4

    .line 22439
    sparse-switch v3, :sswitch_data_0

    .line 22452
    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingTop()I

    move-result v3

    .line 22456
    :goto_0
    const/4 v7, 0x0

    move v6, v3

    :goto_1
    if-ge v7, v11, :cond_7

    .line 23501
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    .line 22458
    if-nez v12, :cond_0

    move v3, v7

    .line 22456
    :goto_2
    add-int/lit8 v7, v3, 0x1

    goto :goto_1

    .line 22442
    :sswitch_0
    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingTop()I

    move-result v3

    add-int v3, v3, p5

    sub-int v3, v3, p3

    move-object/from16 v0, p0

    iget v4, v0, Lxu;->e:I

    sub-int/2addr v3, v4

    .line 22443
    goto :goto_0

    .line 22447
    :sswitch_1
    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingTop()I

    move-result v3

    sub-int v4, p5, p3

    move-object/from16 v0, p0

    iget v6, v0, Lxu;->e:I

    sub-int/2addr v4, v6

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v3, v4

    .line 22448
    goto :goto_0

    .line 22460
    :cond_0
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_c

    .line 22461
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    move-result v13

    .line 22462
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    move-result v14

    .line 22464
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Lxv;

    .line 22467
    iget v4, v3, Lxv;->h:I

    .line 22468
    if-gez v4, :cond_1

    move v4, v5

    .line 22471
    :cond_1
    invoke-static/range {p0 .. p0}, Lgt;->g(Landroid/view/View;)I

    move-result v15

    .line 22472
    invoke-static {v4, v15}, Lfe;->a(II)I

    move-result v4

    .line 22474
    and-int/lit8 v4, v4, 0x7

    sparse-switch v4, :sswitch_data_1

    .line 22486
    iget v4, v3, Lxv;->leftMargin:I

    add-int/2addr v4, v8

    .line 22490
    :goto_3
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lxu;->a(I)Z

    move-result v15

    if-eqz v15, :cond_2

    .line 22491
    move-object/from16 v0, p0

    iget v15, v0, Lxu;->m:I

    add-int/2addr v6, v15

    .line 22494
    :cond_2
    iget v15, v3, Lxv;->topMargin:I

    add-int/2addr v6, v15

    .line 22495
    invoke-static {v12, v4, v6, v13, v14}, Lxu;->b(Landroid/view/View;IIII)V

    .line 22497
    iget v3, v3, Lxv;->bottomMargin:I

    add-int/2addr v3, v14

    add-int/2addr v6, v3

    move v3, v7

    .line 22499
    goto :goto_2

    .line 22476
    :sswitch_2
    sub-int v4, v10, v13

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v8

    iget v15, v3, Lxv;->leftMargin:I

    add-int/2addr v4, v15

    iget v15, v3, Lxv;->rightMargin:I

    sub-int/2addr v4, v15

    .line 22478
    goto :goto_3

    .line 22481
    :sswitch_3
    sub-int v4, v9, v13

    iget v15, v3, Lxv;->rightMargin:I

    sub-int/2addr v4, v15

    .line 22482
    goto :goto_3

    .line 23517
    :cond_3
    invoke-static/range {p0 .. p0}, Ltm;->a(Landroid/view/View;)Z

    move-result v5

    .line 23518
    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingTop()I

    move-result v8

    .line 23524
    sub-int v3, p5, p3

    .line 23525
    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingBottom()I

    move-result v4

    sub-int v12, v3, v4

    .line 23528
    sub-int/2addr v3, v8

    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingBottom()I

    move-result v4

    sub-int v13, v3, v4

    .line 24514
    invoke-virtual/range {p0 .. p0}, Lxu;->getChildCount()I

    move-result v14

    .line 23532
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->d:I

    const v4, 0x800007

    and-int/2addr v3, v4

    .line 23533
    move-object/from16 v0, p0

    iget v4, v0, Lxu;->d:I

    and-int/lit8 v11, v4, 0x70

    .line 23535
    move-object/from16 v0, p0

    iget-boolean v15, v0, Lxu;->g:Z

    .line 23537
    move-object/from16 v0, p0

    iget-object v0, v0, Lxu;->j:[I

    move-object/from16 v16, v0

    .line 23538
    move-object/from16 v0, p0

    iget-object v0, v0, Lxu;->k:[I

    move-object/from16 v17, v0

    .line 23540
    invoke-static/range {p0 .. p0}, Lgt;->g(Landroid/view/View;)I

    move-result v4

    .line 23541
    invoke-static {v3, v4}, Lfe;->a(II)I

    move-result v3

    sparse-switch v3, :sswitch_data_2

    .line 23554
    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingLeft()I

    move-result v9

    .line 23558
    :goto_4
    const/4 v4, 0x0

    .line 23559
    const/4 v3, 0x1

    .line 23561
    if-eqz v5, :cond_b

    .line 23562
    add-int/lit8 v4, v14, -0x1

    .line 23563
    const/4 v3, -0x1

    move v5, v4

    move v4, v3

    .line 23566
    :goto_5
    const/4 v10, 0x0

    :goto_6
    if-ge v10, v14, :cond_7

    .line 23567
    mul-int v3, v4, v10

    add-int v18, v5, v3

    .line 25501
    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v19

    .line 23570
    if-nez v19, :cond_4

    move v3, v10

    .line 23566
    :goto_7
    add-int/lit8 v10, v3, 0x1

    goto :goto_6

    .line 23544
    :sswitch_4
    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingLeft()I

    move-result v3

    add-int v3, v3, p4

    sub-int v3, v3, p2

    move-object/from16 v0, p0

    iget v4, v0, Lxu;->e:I

    sub-int v9, v3, v4

    .line 23545
    goto :goto_4

    .line 23549
    :sswitch_5
    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingLeft()I

    move-result v3

    sub-int v4, p4, p2

    move-object/from16 v0, p0

    iget v6, v0, Lxu;->e:I

    sub-int/2addr v4, v6

    div-int/lit8 v4, v4, 0x2

    add-int v9, v3, v4

    .line 23550
    goto :goto_4

    .line 23572
    :cond_4
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v6, 0x8

    if-eq v3, v6, :cond_a

    .line 23573
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getMeasuredWidth()I

    move-result v20

    .line 23574
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getMeasuredHeight()I

    move-result v21

    .line 23575
    const/4 v6, -0x1

    .line 23577
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Lxv;

    .line 23580
    if-eqz v15, :cond_5

    iget v7, v3, Lxv;->height:I

    const/16 v22, -0x1

    move/from16 v0, v22

    if-eq v7, v0, :cond_5

    .line 23581
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getBaseline()I

    move-result v6

    .line 23584
    :cond_5
    iget v7, v3, Lxv;->h:I

    .line 23585
    if-gez v7, :cond_6

    move v7, v11

    .line 23589
    :cond_6
    and-int/lit8 v7, v7, 0x70

    sparse-switch v7, :sswitch_data_3

    move v6, v8

    .line 23625
    :goto_8
    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-direct {v0, v1}, Lxu;->a(I)Z

    move-result v7

    if-eqz v7, :cond_8

    .line 23626
    move-object/from16 v0, p0

    iget v7, v0, Lxu;->h:I

    add-int/2addr v7, v9

    .line 23629
    :goto_9
    iget v9, v3, Lxv;->leftMargin:I

    add-int/2addr v7, v9

    .line 23630
    move-object/from16 v0, v19

    move/from16 v1, v20

    move/from16 v2, v21

    invoke-static {v0, v7, v6, v1, v2}, Lxu;->b(Landroid/view/View;IIII)V

    .line 23632
    iget v3, v3, Lxv;->rightMargin:I

    add-int v3, v3, v20

    add-int v9, v7, v3

    move v3, v10

    .line 23635
    goto :goto_7

    .line 23591
    :sswitch_6
    iget v7, v3, Lxv;->topMargin:I

    add-int/2addr v7, v8

    .line 23592
    const/16 v22, -0x1

    move/from16 v0, v22

    if-eq v6, v0, :cond_9

    .line 23593
    const/16 v22, 0x1

    aget v22, v16, v22

    sub-int v6, v22, v6

    add-int/2addr v6, v7

    goto :goto_8

    .line 23609
    :sswitch_7
    sub-int v6, v13, v21

    div-int/lit8 v6, v6, 0x2

    add-int/2addr v6, v8

    iget v7, v3, Lxv;->topMargin:I

    add-int/2addr v6, v7

    iget v7, v3, Lxv;->bottomMargin:I

    sub-int/2addr v6, v7

    .line 23611
    goto :goto_8

    .line 23614
    :sswitch_8
    sub-int v7, v12, v21

    iget v0, v3, Lxv;->bottomMargin:I

    move/from16 v22, v0

    sub-int v7, v7, v22

    .line 23615
    const/16 v22, -0x1

    move/from16 v0, v22

    if-eq v6, v0, :cond_9

    .line 23616
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getMeasuredHeight()I

    move-result v22

    sub-int v6, v22, v6

    .line 23617
    const/16 v22, 0x2

    aget v22, v17, v22

    sub-int v6, v22, v6

    sub-int v6, v7, v6

    .line 23618
    goto :goto_8

    .line 1407
    :cond_7
    return-void

    :cond_8
    move v7, v9

    goto :goto_9

    :cond_9
    move v6, v7

    goto :goto_8

    :cond_a
    move v3, v10

    goto/16 :goto_7

    :cond_b
    move v5, v4

    move v4, v3

    goto/16 :goto_5

    :cond_c
    move v3, v7

    goto/16 :goto_2

    .line 22439
    nop

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x50 -> :sswitch_0
    .end sparse-switch

    .line 22474
    :sswitch_data_1
    .sparse-switch
        0x1 -> :sswitch_2
        0x5 -> :sswitch_3
    .end sparse-switch

    .line 23541
    :sswitch_data_2
    .sparse-switch
        0x1 -> :sswitch_5
        0x5 -> :sswitch_4
    .end sparse-switch

    .line 23589
    :sswitch_data_3
    .sparse-switch
        0x10 -> :sswitch_7
        0x30 -> :sswitch_6
        0x50 -> :sswitch_8
    .end sparse-switch
.end method

.method public onMeasure(II)V
    .locals 27

    .prologue
    .line 546
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->c:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1f

    .line 10590
    const/4 v3, 0x0

    move-object/from16 v0, p0

    iput v3, v0, Lxu;->e:I

    .line 10591
    const/16 v18, 0x0

    .line 10592
    const/16 v17, 0x0

    .line 10593
    const/16 v16, 0x0

    .line 10594
    const/4 v15, 0x0

    .line 10595
    const/4 v14, 0x1

    .line 10596
    const/4 v5, 0x0

    .line 11514
    invoke-virtual/range {p0 .. p0}, Lxu;->getChildCount()I

    move-result v21

    .line 10600
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v22

    .line 10601
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v23

    .line 10603
    const/4 v10, 0x0

    .line 10604
    const/4 v12, 0x0

    .line 10606
    move-object/from16 v0, p0

    iget v0, v0, Lxu;->a:I

    move/from16 v24, v0

    .line 10607
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lxu;->i:Z

    move/from16 v25, v0

    .line 10609
    const/high16 v11, -0x80000000

    .line 10612
    const/16 v19, 0x0

    :goto_0
    move/from16 v0, v19

    move/from16 v1, v21

    if-ge v0, v1, :cond_c

    .line 12501
    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 10615
    if-nez v4, :cond_0

    .line 10616
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->e:I

    move-object/from16 v0, p0

    iput v3, v0, Lxu;->e:I

    move/from16 v3, v19

    .line 10612
    :goto_1
    add-int/lit8 v19, v3, 0x1

    goto :goto_0

    .line 10620
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v6, 0x8

    if-eq v3, v6, :cond_26

    .line 10625
    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-direct {v0, v1}, Lxu;->a(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 10626
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->e:I

    move-object/from16 v0, p0

    iget v6, v0, Lxu;->m:I

    add-int/2addr v3, v6

    move-object/from16 v0, p0

    iput v3, v0, Lxu;->e:I

    .line 10629
    :cond_1
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Lxv;

    .line 10631
    iget v3, v9, Lxv;->g:F

    add-float v13, v5, v3

    .line 10633
    const/high16 v3, 0x40000000    # 2.0f

    move/from16 v0, v23

    if-ne v0, v3, :cond_3

    iget v3, v9, Lxv;->height:I

    if-nez v3, :cond_3

    iget v3, v9, Lxv;->g:F

    const/4 v5, 0x0

    cmpl-float v3, v3, v5

    if-lez v3, :cond_3

    .line 10637
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->e:I

    .line 10638
    iget v5, v9, Lxv;->topMargin:I

    add-int/2addr v5, v3

    iget v6, v9, Lxv;->bottomMargin:I

    add-int/2addr v5, v6

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    move-object/from16 v0, p0

    iput v3, v0, Lxu;->e:I

    .line 10639
    const/4 v12, 0x1

    move v8, v11

    move v11, v12

    .line 10678
    :goto_2
    if-ltz v24, :cond_2

    add-int/lit8 v3, v19, 0x1

    move/from16 v0, v24

    if-ne v0, v3, :cond_2

    .line 10679
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->e:I

    move-object/from16 v0, p0

    iput v3, v0, Lxu;->b:I

    .line 10685
    :cond_2
    move/from16 v0, v19

    move/from16 v1, v24

    if-ge v0, v1, :cond_7

    iget v3, v9, Lxv;->g:F

    const/4 v5, 0x0

    cmpl-float v3, v3, v5

    if-lez v3, :cond_7

    .line 10686
    new-instance v3, Ljava/lang/RuntimeException;

    const-string v4, "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex."

    invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 10641
    :cond_3
    const/high16 v3, -0x80000000

    .line 10643
    iget v5, v9, Lxv;->height:I

    if-nez v5, :cond_4

    iget v5, v9, Lxv;->g:F

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    if-lez v5, :cond_4

    .line 10648
    const/4 v3, 0x0

    .line 10649
    const/4 v5, -0x2

    iput v5, v9, Lxv;->height:I

    :cond_4
    move/from16 v20, v3

    .line 10656
    const/4 v6, 0x0

    const/4 v3, 0x0

    cmpl-float v3, v13, v3

    if-nez v3, :cond_6

    move-object/from16 v0, p0

    iget v8, v0, Lxu;->e:I

    :goto_3
    move-object/from16 v3, p0

    move/from16 v5, p1

    move/from16 v7, p2

    invoke-direct/range {v3 .. v8}, Lxu;->a(Landroid/view/View;IIII)V

    .line 10660
    const/high16 v3, -0x80000000

    move/from16 v0, v20

    if-eq v0, v3, :cond_5

    .line 10661
    move/from16 v0, v20

    iput v0, v9, Lxv;->height:I

    .line 10664
    :cond_5
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    .line 10665
    move-object/from16 v0, p0

    iget v5, v0, Lxu;->e:I

    .line 10666
    add-int v6, v5, v3

    iget v7, v9, Lxv;->topMargin:I

    add-int/2addr v6, v7

    iget v7, v9, Lxv;->bottomMargin:I

    add-int/2addr v6, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    move-object/from16 v0, p0

    iput v5, v0, Lxu;->e:I

    .line 10669
    if-eqz v25, :cond_25

    .line 10670
    invoke-static {v3, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    move v8, v11

    move v11, v12

    goto :goto_2

    .line 10656
    :cond_6
    const/4 v8, 0x0

    goto :goto_3

    .line 10692
    :cond_7
    const/4 v3, 0x0

    .line 10693
    const/high16 v5, 0x40000000    # 2.0f

    move/from16 v0, v22

    if-eq v0, v5, :cond_24

    iget v5, v9, Lxv;->width:I

    const/4 v6, -0x1

    if-ne v5, v6, :cond_24

    .line 10698
    const/4 v5, 0x1

    .line 10699
    const/4 v3, 0x1

    .line 10702
    :goto_4
    iget v6, v9, Lxv;->leftMargin:I

    iget v7, v9, Lxv;->rightMargin:I

    add-int/2addr v6, v7

    .line 10703
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    add-int/2addr v7, v6

    .line 10704
    move/from16 v0, v18

    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v12

    .line 10705
    invoke-static {v4}, Lgt;->j(Landroid/view/View;)I

    move-result v4

    move/from16 v0, v17

    invoke-static {v0, v4}, Ltm;->a(II)I

    move-result v10

    .line 10708
    if-eqz v14, :cond_8

    iget v4, v9, Lxv;->width:I

    const/4 v14, -0x1

    if-ne v4, v14, :cond_8

    const/4 v4, 0x1

    .line 10709
    :goto_5
    iget v9, v9, Lxv;->g:F

    const/4 v14, 0x0

    cmpl-float v9, v9, v14

    if-lez v9, :cond_a

    .line 10714
    if-eqz v3, :cond_9

    move v3, v6

    :goto_6
    invoke-static {v15, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    move v6, v13

    move v7, v4

    move/from16 v9, v16

    move v4, v11

    move v11, v12

    move/from16 v26, v8

    move v8, v3

    move/from16 v3, v26

    :goto_7
    move v12, v4

    move v14, v7

    move v15, v8

    move/from16 v16, v9

    move/from16 v17, v10

    move/from16 v18, v11

    move v10, v5

    move v11, v3

    move v5, v6

    move/from16 v3, v19

    .line 10721
    goto/16 :goto_1

    .line 10708
    :cond_8
    const/4 v4, 0x0

    goto :goto_5

    :cond_9
    move v3, v7

    .line 10714
    goto :goto_6

    .line 10717
    :cond_a
    if-eqz v3, :cond_b

    :goto_8
    move/from16 v0, v16

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    move v6, v13

    move v7, v4

    move v9, v3

    move v4, v11

    move v3, v8

    move v8, v15

    move v11, v12

    goto :goto_7

    :cond_b
    move v6, v7

    goto :goto_8

    .line 10724
    :cond_c
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->e:I

    if-lez v3, :cond_d

    move-object/from16 v0, p0

    move/from16 v1, v21

    invoke-direct {v0, v1}, Lxu;->a(I)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 10725
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->e:I

    move-object/from16 v0, p0

    iget v4, v0, Lxu;->m:I

    add-int/2addr v3, v4

    move-object/from16 v0, p0

    iput v3, v0, Lxu;->e:I

    .line 10728
    :cond_d
    if-eqz v25, :cond_11

    const/high16 v3, -0x80000000

    move/from16 v0, v23

    if-eq v0, v3, :cond_e

    if-nez v23, :cond_11

    .line 10730
    :cond_e
    const/4 v3, 0x0

    move-object/from16 v0, p0

    iput v3, v0, Lxu;->e:I

    .line 10732
    const/4 v4, 0x0

    :goto_9
    move/from16 v0, v21

    if-ge v4, v0, :cond_11

    .line 13501
    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 10735
    if-nez v3, :cond_f

    .line 10736
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->e:I

    move-object/from16 v0, p0

    iput v3, v0, Lxu;->e:I

    move v3, v4

    .line 10732
    :goto_a
    add-int/lit8 v4, v3, 0x1

    goto :goto_9

    .line 10740
    :cond_f
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v6

    const/16 v7, 0x8

    if-ne v6, v7, :cond_10

    move v3, v4

    .line 10742
    goto :goto_a

    .line 10745
    :cond_10
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Lxv;

    .line 10748
    move-object/from16 v0, p0

    iget v6, v0, Lxu;->e:I

    .line 10749
    add-int v7, v6, v11

    iget v8, v3, Lxv;->topMargin:I

    add-int/2addr v7, v8

    iget v3, v3, Lxv;->bottomMargin:I

    add-int/2addr v3, v7

    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    move-object/from16 v0, p0

    iput v3, v0, Lxu;->e:I

    move v3, v4

    goto :goto_a

    .line 10755
    :cond_11
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->e:I

    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingTop()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingBottom()I

    move-result v6

    add-int/2addr v4, v6

    add-int/2addr v3, v4

    move-object/from16 v0, p0

    iput v3, v0, Lxu;->e:I

    .line 10757
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->e:I

    .line 10760
    invoke-virtual/range {p0 .. p0}, Lxu;->getSuggestedMinimumHeight()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 10763
    const/4 v4, 0x0

    move/from16 v0, p2

    invoke-static {v3, v0, v4}, Lgt;->a(III)I

    move-result v19

    .line 10764
    const v3, 0xffffff

    and-int v3, v3, v19

    .line 10769
    move-object/from16 v0, p0

    iget v4, v0, Lxu;->e:I

    sub-int v6, v3, v4

    .line 10770
    if-nez v12, :cond_12

    if-eqz v6, :cond_1d

    const/4 v3, 0x0

    cmpl-float v3, v5, v3

    if-lez v3, :cond_1d

    .line 10771
    :cond_12
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->f:F

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    if-lez v3, :cond_13

    move-object/from16 v0, p0

    iget v5, v0, Lxu;->f:F

    .line 10773
    :cond_13
    const/4 v3, 0x0

    move-object/from16 v0, p0

    iput v3, v0, Lxu;->e:I

    .line 10775
    const/4 v3, 0x0

    move v15, v3

    move v12, v14

    move/from16 v13, v16

    move/from16 v11, v17

    move/from16 v14, v18

    :goto_b
    move/from16 v0, v21

    if-ge v15, v0, :cond_1b

    .line 14501
    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    .line 10778
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_23

    .line 10782
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Lxv;

    .line 10784
    iget v8, v3, Lxv;->g:F

    .line 10785
    const/4 v4, 0x0

    cmpl-float v4, v8, v4

    if-lez v4, :cond_22

    .line 10787
    int-to-float v4, v6

    mul-float/2addr v4, v8

    div-float/2addr v4, v5

    float-to-int v4, v4

    .line 10788
    sub-float v8, v5, v8

    .line 10789
    sub-int v9, v6, v4

    .line 10791
    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingLeft()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingRight()I

    move-result v6

    add-int/2addr v5, v6

    iget v6, v3, Lxv;->leftMargin:I

    add-int/2addr v5, v6

    iget v6, v3, Lxv;->rightMargin:I

    add-int/2addr v5, v6

    iget v6, v3, Lxv;->width:I

    move/from16 v0, p1

    invoke-static {v0, v5, v6}, Lxu;->getChildMeasureSpec(III)I

    move-result v5

    .line 10797
    iget v6, v3, Lxv;->height:I

    if-nez v6, :cond_14

    const/high16 v6, 0x40000000    # 2.0f

    move/from16 v0, v23

    if-eq v0, v6, :cond_16

    .line 10800
    :cond_14
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    add-int/2addr v4, v6

    .line 10801
    if-gez v4, :cond_15

    .line 10802
    const/4 v4, 0x0

    :cond_15
    move-object v6, v7

    .line 10810
    :goto_c
    const/high16 v16, 0x40000000    # 2.0f

    move/from16 v0, v16

    invoke-static {v4, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-virtual {v6, v5, v4}, Landroid/view/View;->measure(II)V

    .line 10816
    invoke-static {v7}, Lgt;->j(Landroid/view/View;)I

    move-result v4

    and-int/lit16 v4, v4, -0x100

    invoke-static {v11, v4}, Ltm;->a(II)I

    move-result v4

    move v5, v9

    move v6, v4

    move v4, v8

    .line 10821
    :goto_d
    iget v8, v3, Lxv;->leftMargin:I

    iget v9, v3, Lxv;->rightMargin:I

    add-int/2addr v8, v9

    .line 10822
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    add-int/2addr v9, v8

    .line 10823
    invoke-static {v14, v9}, Ljava/lang/Math;->max(II)I

    move-result v11

    .line 10825
    const/high16 v14, 0x40000000    # 2.0f

    move/from16 v0, v22

    if-eq v0, v14, :cond_18

    iget v14, v3, Lxv;->width:I

    const/16 v16, -0x1

    move/from16 v0, v16

    if-ne v14, v0, :cond_18

    const/4 v14, 0x1

    .line 10828
    :goto_e
    if-eqz v14, :cond_19

    :goto_f
    invoke-static {v13, v8}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 10831
    if-eqz v12, :cond_1a

    iget v8, v3, Lxv;->width:I

    const/4 v12, -0x1

    if-ne v8, v12, :cond_1a

    const/4 v8, 0x1

    .line 10833
    :goto_10
    move-object/from16 v0, p0

    iget v12, v0, Lxu;->e:I

    .line 10834
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    add-int/2addr v7, v12

    iget v13, v3, Lxv;->topMargin:I

    add-int/2addr v7, v13

    iget v3, v3, Lxv;->bottomMargin:I

    add-int/2addr v3, v7

    invoke-static {v12, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    move-object/from16 v0, p0

    iput v3, v0, Lxu;->e:I

    move v3, v9

    move v7, v11

    .line 10775
    :goto_11
    add-int/lit8 v9, v15, 0x1

    move v15, v9

    move v12, v8

    move v13, v3

    move v11, v6

    move v14, v7

    move v6, v5

    move v5, v4

    goto/16 :goto_b

    .line 10810
    :cond_16
    if-lez v4, :cond_17

    move-object v6, v7

    goto :goto_c

    :cond_17
    const/4 v4, 0x0

    move-object v6, v7

    goto :goto_c

    .line 10825
    :cond_18
    const/4 v14, 0x0

    goto :goto_e

    :cond_19
    move v8, v9

    .line 10828
    goto :goto_f

    .line 10831
    :cond_1a
    const/4 v8, 0x0

    goto :goto_10

    .line 10839
    :cond_1b
    move-object/from16 v0, p0

    iget v3, v0, Lxu;->e:I

    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingTop()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingBottom()I

    move-result v5

    add-int/2addr v4, v5

    add-int/2addr v3, v4

    move-object/from16 v0, p0

    iput v3, v0, Lxu;->e:I

    move v3, v13

    move/from16 v17, v11

    move v4, v14

    move v14, v12

    .line 10871
    :goto_12
    if-nez v14, :cond_20

    const/high16 v5, 0x40000000    # 2.0f

    move/from16 v0, v22

    if-eq v0, v5, :cond_20

    .line 10875
    :goto_13
    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingLeft()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lxu;->getPaddingRight()I

    move-result v5

    add-int/2addr v4, v5

    add-int/2addr v3, v4

    .line 10878
    invoke-virtual/range {p0 .. p0}, Lxu;->getSuggestedMinimumWidth()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 10880
    move/from16 v0, p1

    move/from16 v1, v17

    invoke-static {v3, v0, v1}, Lgt;->a(III)I

    move-result v3

    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-virtual {v0, v3, v1}, Lxu;->setMeasuredDimension(II)V

    .line 10883
    if-eqz v10, :cond_1c

    .line 10884
    move-object/from16 v0, p0

    move/from16 v1, v21

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lxu;->a(II)V

    .line 551
    :cond_1c
    :goto_14
    return-void

    .line 10842
    :cond_1d
    move/from16 v0, v16

    invoke-static {v0, v15}, Ljava/lang/Math;->max(II)I

    move-result v13

    .line 10848
    if-eqz v25, :cond_21

    const/high16 v3, 0x40000000    # 2.0f

    move/from16 v0, v23

    if-eq v0, v3, :cond_21

    .line 10849
    const/4 v3, 0x0

    move v4, v3

    :goto_15
    move/from16 v0, v21

    if-ge v4, v0, :cond_21

    .line 15501
    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 10852
    if-eqz v5, :cond_1e

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v6, 0x8

    if-eq v3, v6, :cond_1e

    .line 10856
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Lxv;

    .line 10859
    iget v3, v3, Lxv;->g:F

    .line 10860
    const/4 v6, 0x0

    cmpl-float v3, v3, v6

    if-lez v3, :cond_1e

    .line 10861
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    const/high16 v6, 0x40000000    # 2.0f

    invoke-static {v3, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    const/high16 v6, 0x40000000    # 2.0f

    invoke-static {v11, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    invoke-virtual {v5, v3, v6}, Landroid/view/View;->measure(II)V

    .line 10849
    :cond_1e
    add-int/lit8 v3, v4, 0x1

    move v4, v3

    goto :goto_15

    .line 549
    :cond_1f
    invoke-direct/range {p0 .. p2}, Lxu;->b(II)V

    goto :goto_14

    :cond_20
    move v3, v4

    goto :goto_13

    :cond_21
    move v3, v13

    move/from16 v4, v18

    goto/16 :goto_12

    :cond_22
    move v4, v5

    move v5, v6

    move v6, v11

    goto/16 :goto_d

    :cond_23
    move v4, v5

    move v8, v12

    move v3, v13

    move v7, v14

    move v5, v6

    move v6, v11

    goto/16 :goto_11

    :cond_24
    move v5, v10

    goto/16 :goto_4

    :cond_25
    move v8, v11

    move v11, v12

    goto/16 :goto_2

    :cond_26
    move v3, v11

    move v4, v12

    move v6, v5

    move v7, v14

    move v8, v15

    move/from16 v9, v16

    move v5, v10

    move/from16 v11, v18

    move/from16 v10, v17

    goto/16 :goto_7
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    .prologue
    .line 200
    const/4 v0, 0x0

    return v0
.end method

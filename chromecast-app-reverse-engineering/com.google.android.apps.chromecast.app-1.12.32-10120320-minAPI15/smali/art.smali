.class public final Lart;
.super Landroid/widget/ArrayAdapter;
.source "PG"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# static fields
.field private static final a:Ljava/util/Set;


# instance fields
.field private final b:Laqw;

.field private final c:Lasz;

.field private final d:Z

.field private final e:Landroid/content/Context;

.field private final f:Latf;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 58
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Integer;

    const/4 v2, 0x0

    const/16 v3, 0xd

    .line 59
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const/16 v3, 0xe

    .line 60
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const/16 v3, 0x10

    .line 61
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    .line 58
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lart;->a:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lasz;ILjava/util/List;Z)V
    .locals 1

    .prologue
    .line 71
    const v0, 0x1090003

    invoke-direct {p0, p1, v0, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 72
    iput-object p1, p0, Lart;->e:Landroid/content/Context;

    .line 73
    iput-object p2, p0, Lart;->c:Lasz;

    move-object v0, p1

    .line 74
    check-cast v0, Laqw;

    iput-object v0, p0, Lart;->b:Laqw;

    .line 75
    iput-boolean p5, p0, Lart;->d:Z

    .line 76
    invoke-static {p1}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v0

    iput-object v0, p0, Lart;->f:Latf;

    .line 77
    return-void
.end method

.method private a(Landroid/view/View;Ldcj;)Landroid/view/View;
    .locals 13

    .prologue
    const/16 v4, 0x9

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 145
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lasa;

    .line 146
    invoke-virtual {v0}, Lasa;->a()Lasa;

    .line 147
    iget-object v1, p2, Ldcj;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v4, :cond_5

    .line 1550
    iget-object v1, p2, Ldcj;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v4, :cond_3

    .line 1551
    iget-object v1, v0, Lasa;->i:Landroid/widget/RadioGroup;

    invoke-virtual {v1, v3}, Landroid/widget/RadioGroup;->setVisibility(I)V

    .line 1552
    iget-object v1, v0, Lasa;->j:Lart;

    .line 1553
    invoke-virtual {v1}, Lart;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v4, "layout_inflater"

    .line 1554
    invoke-virtual {v1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/LayoutInflater;

    .line 1555
    iget-object v5, p2, Ldcj;->i:[Ldcj;

    array-length v6, v5

    move v4, v3

    :goto_0
    if-ge v4, v6, :cond_3

    aget-object v7, v5, v4

    .line 1556
    sget v8, La;->fA:I

    const/4 v9, 0x0

    invoke-virtual {v1, v8, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    .line 1557
    new-instance v9, Lasa;

    iget-object v10, v0, Lasa;->j:Lart;

    invoke-direct {v9, v10, v8}, Lasa;-><init>(Lart;Landroid/view/View;)V

    .line 1559
    invoke-virtual {v8, v9}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1560
    invoke-virtual {v9}, Lasa;->a()Lasa;

    move-result-object v9

    iget-object v10, v7, Ldcj;->c:Ljava/lang/String;

    .line 1561
    invoke-virtual {v9, v10}, Lasa;->a(Ljava/lang/String;)Lasa;

    move-result-object v9

    iget-object v10, v7, Ldcj;->d:Ljava/lang/String;

    .line 2482
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_0

    iget-object v11, v9, Lasa;->a:Landroid/widget/TextView;

    if-eqz v11, :cond_0

    .line 2483
    iget-object v11, v9, Lasa;->a:Landroid/widget/TextView;

    invoke-virtual {v11, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2484
    iget-object v11, v9, Lasa;->a:Landroid/widget/TextView;

    invoke-virtual {v11, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1562
    :cond_0
    iget-object v10, v7, Ldcj;->b:Ljava/lang/Integer;

    .line 2508
    if-eqz v10, :cond_1

    .line 2509
    iget-object v11, v9, Lasa;->e:Landroid/widget/RadioButton;

    invoke-virtual {v11, v3}, Landroid/widget/RadioButton;->setVisibility(I)V

    .line 2510
    iget-object v11, v9, Lasa;->e:Landroid/widget/RadioButton;

    iget-object v12, v9, Lasa;->j:Lart;

    .line 3042
    iget-object v12, v12, Lart;->b:Laqw;

    .line 2511
    invoke-interface {v12}, Laqw;->h()Lash;

    move-result-object v12

    invoke-virtual {v12}, Lash;->s()Lauq;

    move-result-object v12

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-virtual {v12, v10}, Lauq;->a(I)Z

    move-result v10

    .line 2510
    invoke-virtual {v11, v10}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 1563
    :cond_1
    iget-object v10, v0, Lasa;->j:Lart;

    .line 4277
    new-instance v11, Lary;

    invoke-direct {v11, v10, p2, v7}, Lary;-><init>(Lart;Ldcj;Ldcj;)V

    .line 4537
    iget-object v7, v9, Lasa;->e:Landroid/widget/RadioButton;

    invoke-virtual {v7}, Landroid/widget/RadioButton;->getVisibility()I

    move-result v7

    if-nez v7, :cond_2

    .line 4538
    iget-object v7, v9, Lasa;->e:Landroid/widget/RadioButton;

    invoke-virtual {v7, v11}, Landroid/widget/RadioButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4539
    invoke-virtual {v9, v11}, Lasa;->a(Landroid/view/View$OnClickListener;)Lasa;

    .line 1566
    :cond_2
    iget-object v7, v0, Lasa;->i:Landroid/widget/RadioGroup;

    invoke-virtual {v7, v8}, Landroid/widget/RadioGroup;->addView(Landroid/view/View;)V

    .line 1555
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 148
    :cond_3
    iget-object v1, p2, Ldcj;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lasa;->a(Ljava/lang/String;)Lasa;

    .line 164
    :cond_4
    :goto_1
    invoke-virtual {p1, v2}, Landroid/view/View;->setClickable(Z)V

    .line 165
    return-object p1

    .line 150
    :cond_5
    iget-object v1, p2, Ldcj;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lasa;->a(Ljava/lang/String;)Lasa;

    move-result-object v4

    iget-object v1, p2, Ldcj;->h:Ljava/lang/String;

    .line 5490
    if-eqz v1, :cond_6

    .line 5491
    iget-object v5, v4, Lasa;->c:Landroid/widget/ImageView;

    invoke-virtual {v5, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 5492
    iget-object v5, v4, Lasa;->j:Lart;

    .line 6042
    iget-object v5, v5, Lart;->f:Latf;

    .line 5492
    iget-object v6, v4, Lasa;->c:Landroid/widget/ImageView;

    invoke-virtual {v5, v1, v6, v3}, Latf;->a(Ljava/lang/String;Landroid/widget/ImageView;Z)Laex;

    move-result-object v1

    iput-object v1, v4, Lasa;->h:Laex;

    .line 151
    :cond_6
    iget-object v1, p2, Ldcj;->a:Ljava/lang/Integer;

    .line 152
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v5, 0x3

    if-ne v1, v5, :cond_a

    move v1, v2

    :goto_2
    iget-object v5, p2, Ldcj;->b:Ljava/lang/Integer;

    .line 6498
    if-eqz v1, :cond_7

    if-eqz v5, :cond_7

    .line 6499
    iget-object v1, v4, Lasa;->d:Landroid/widget/CheckBox;

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 6500
    iget-object v1, v4, Lasa;->d:Landroid/widget/CheckBox;

    iget-object v6, v4, Lasa;->j:Lart;

    .line 7042
    iget-object v6, v6, Lart;->b:Laqw;

    .line 6500
    invoke-interface {v6}, Laqw;->h()Lash;

    move-result-object v6

    invoke-virtual {v6}, Lash;->s()Lauq;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v6, v7}, Lauq;->a(I)Z

    move-result v6

    invoke-virtual {v1, v6}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 6501
    iget-object v1, v4, Lasa;->j:Lart;

    .line 8042
    iget-object v1, v1, Lart;->b:Laqw;

    .line 6501
    invoke-interface {v1}, Laqw;->h()Lash;

    move-result-object v1

    .line 8549
    iget-object v1, v1, Lash;->d:Lasb;

    invoke-virtual {v1}, Lasb;->a()V

    .line 6502
    iget-object v1, v4, Lasa;->j:Lart;

    .line 9042
    invoke-static {v5}, Lart;->a(Ljava/lang/Integer;)V

    .line 9418
    :cond_7
    iget-object v1, v0, Lasa;->f:Landroid/widget/CompoundButton;

    .line 10220
    new-instance v5, Larv;

    invoke-direct {v5, p0, p2, v1}, Larv;-><init>(Lart;Ldcj;Landroid/widget/CompoundButton;)V

    .line 153
    invoke-virtual {v4, v5}, Lasa;->a(Landroid/view/View$OnClickListener;)Lasa;

    .line 155
    iget-object v1, p2, Ldcj;->i:[Ldcj;

    if-eqz v1, :cond_8

    iget-object v1, p2, Ldcj;->i:[Ldcj;

    array-length v1, v1

    if-gtz v1, :cond_9

    :cond_8
    iget-object v1, p2, Ldcj;->o:Ljava/lang/String;

    .line 156
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 157
    :cond_9
    iget-object v1, p2, Ldcj;->j:Ljava/lang/String;

    .line 10573
    iget-object v4, v0, Lasa;->j:Lart;

    .line 11042
    iget-object v4, v4, Lart;->b:Laqw;

    .line 10573
    invoke-interface {v4}, Laqw;->h()Lash;

    move-result-object v4

    invoke-virtual {v4}, Lash;->s()Lauq;

    move-result-object v4

    invoke-virtual {v4, v1}, Lauq;->a(Ljava/lang/String;)Z

    move-result v1

    .line 10574
    iget-object v4, v0, Lasa;->b:Landroid/widget/TextView;

    if-eqz v1, :cond_b

    sget v1, Lb;->dh:I

    :goto_3
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(I)V

    .line 10575
    iget-object v0, v0, Lasa;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_1

    :cond_a
    move v1, v3

    .line 152
    goto :goto_2

    .line 10574
    :cond_b
    sget v1, Lb;->dg:I

    goto :goto_3

    .line 158
    :cond_c
    iget-object v1, p2, Ldcj;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v4, 0xc

    if-ne v1, v4, :cond_d

    .line 159
    iget-object v1, p2, Ldcj;->d:Ljava/lang/String;

    .line 11580
    iget-object v4, v0, Lasa;->b:Landroid/widget/TextView;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11581
    iget-object v0, v0, Lasa;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_1

    .line 161
    :cond_d
    iget-object v1, p2, Ldcj;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v4, 0x2

    if-ne v1, v4, :cond_e

    move v1, v2

    .line 12518
    :goto_4
    if-eqz v1, :cond_4

    iget-object v1, p2, Ldcj;->j:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 12519
    iget-object v1, v0, Lasa;->g:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 12520
    iget-object v1, v0, Lasa;->f:Landroid/widget/CompoundButton;

    invoke-virtual {v1, v3}, Landroid/widget/CompoundButton;->setVisibility(I)V

    .line 12521
    iget-object v1, v0, Lasa;->j:Lart;

    .line 13042
    iget-object v1, v1, Lart;->b:Laqw;

    .line 12522
    invoke-interface {v1}, Laqw;->h()Lash;

    move-result-object v1

    invoke-virtual {v1}, Lash;->s()Lauq;

    move-result-object v1

    iget-object v3, p2, Ldcj;->j:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lauq;->a(Ljava/lang/String;)Z

    move-result v1

    .line 12523
    iget-object v3, v0, Lasa;->f:Landroid/widget/CompoundButton;

    invoke-virtual {v3, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 12524
    iget-object v3, v0, Lasa;->f:Landroid/widget/CompoundButton;

    invoke-virtual {v3, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 12525
    iget-object v3, v0, Lasa;->f:Landroid/widget/CompoundButton;

    invoke-virtual {v3, p2}, Landroid/widget/CompoundButton;->setTag(Ljava/lang/Object;)V

    .line 12527
    if-eqz v1, :cond_f

    .line 12528
    iget-object v1, v0, Lasa;->j:Lart;

    invoke-virtual {v1}, Lart;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v3, Lb;->B:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 12530
    :goto_5
    iget-object v3, v0, Lasa;->f:Landroid/widget/CompoundButton;

    invoke-virtual {v3, v1}, Landroid/widget/CompoundButton;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 12531
    iget-object v0, v0, Lasa;->g:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_e
    move v1, v3

    .line 161
    goto :goto_4

    .line 12529
    :cond_f
    iget-object v1, v0, Lasa;->j:Lart;

    invoke-virtual {v1}, Lart;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v3, Lb;->D:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_5
.end method

.method static synthetic a(Lart;)Laqw;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lart;->b:Laqw;

    return-object v0
.end method

.method static synthetic a(Lart;Ldcj;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 42
    .line 18293
    iget-object v1, p1, Ldcj;->i:[Ldcj;

    aget-object v1, v1, v0

    iget-object v1, v1, Ldcj;->a:Ljava/lang/Integer;

    if-nez v1, :cond_0

    .line 18295
    :goto_0
    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    .line 18296
    iget-object v0, p0, Lart;->b:Laqw;

    invoke-interface {v0, p1}, Laqw;->a(Ldcj;)V

    .line 18298
    :goto_1
    return-void

    .line 18293
    :cond_0
    iget-object v1, p1, Ldcj;->i:[Ldcj;

    aget-object v0, v1, v0

    iget-object v0, v0, Ldcj;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    .line 18297
    :cond_1
    const/16 v1, 0xa

    if-ne v0, v1, :cond_2

    .line 18298
    iget-object v0, p0, Lart;->b:Laqw;

    invoke-interface {v0, p1}, Laqw;->b(Ldcj;)V

    goto :goto_1

    .line 18300
    :cond_2
    iget-object v0, p0, Lart;->b:Laqw;

    const-string v1, "backdrop_child"

    invoke-interface {v0, p1, v1}, Laqw;->b(Ldcj;Ljava/lang/String;)V

    goto :goto_1
.end method

.method static synthetic a(Lart;Ldcj;Z)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1, p2}, Lart;->a(Ldcj;Z)V

    return-void
.end method

.method static synthetic a(Lart;Ljava/lang/Integer;)V
    .locals 0

    .prologue
    .line 42
    invoke-static {p1}, Lart;->a(Ljava/lang/Integer;)V

    return-void
.end method

.method private a(Ldcj;Z)V
    .locals 2

    .prologue
    .line 314
    iget-object v0, p0, Lart;->b:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    invoke-virtual {v0}, Lash;->s()Lauq;

    move-result-object v0

    .line 315
    iget-object v1, p1, Ldcj;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lauq;->a(Ljava/lang/String;)Z

    move-result v1

    if-eq v1, p2, :cond_0

    .line 316
    iget-object v1, p1, Ldcj;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, p2}, Lauq;->a(Ljava/lang/String;Z)V

    .line 317
    iget-object v0, p0, Lart;->b:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    .line 17549
    iget-object v0, v0, Lash;->d:Lasb;

    invoke-virtual {v0}, Lasb;->a()V

    .line 318
    iget-object v0, p1, Ldcj;->b:Ljava/lang/Integer;

    invoke-static {v0}, Lart;->a(Ljava/lang/Integer;)V

    .line 319
    iget-object v0, p0, Lart;->c:Lasz;

    if-eqz v0, :cond_0

    .line 320
    iget-object v0, p0, Lart;->c:Lasz;

    invoke-interface {v0}, Lasz;->p()V

    .line 323
    :cond_0
    return-void
.end method

.method private static a(Ljava/lang/Integer;)V
    .locals 3

    .prologue
    .line 326
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    new-instance v1, Lapd;

    const/16 v2, 0x4c

    invoke-direct {v1, v2}, Lapd;-><init>(I)V

    .line 327
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    .line 326
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 328
    return-void
.end method

.method private static b(Landroid/view/View;Ldcj;)Landroid/view/View;
    .locals 2

    .prologue
    .line 169
    iget-object v0, p1, Ldcj;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, p0

    .line 170
    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p1, Ldcj;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 175
    :goto_0
    return-object p0

    .line 173
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method private c(Landroid/view/View;Ldcj;)Landroid/view/View;
    .locals 5

    .prologue
    const v3, 0x106000d

    const/16 v2, 0x8

    const/4 v4, 0x0

    .line 179
    .line 180
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Larz;

    .line 13351
    iget-object v1, v0, Larz;->a:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 13352
    iget-object v1, v0, Larz;->g:Laex;

    if-eqz v1, :cond_0

    .line 13353
    iget-object v1, v0, Larz;->a:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 13354
    iget-object v1, v0, Larz;->g:Laex;

    invoke-virtual {v1}, Laex;->a()V

    .line 13356
    :cond_0
    iget-object v1, v0, Larz;->b:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 13357
    iget-object v1, v0, Larz;->h:Laex;

    if-eqz v1, :cond_1

    .line 13358
    iget-object v1, v0, Larz;->b:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 13359
    iget-object v1, v0, Larz;->h:Laex;

    invoke-virtual {v1}, Laex;->a()V

    .line 13361
    :cond_1
    iget-object v1, v0, Larz;->f:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 13362
    iget-object v1, v0, Larz;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 13363
    iget-object v1, v0, Larz;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 13364
    iget-object v1, v0, Larz;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 182
    iget-object v1, p2, Ldcj;->n:[Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v1, p2, Ldcj;->n:[Ljava/lang/String;

    array-length v1, v1

    if-lez v1, :cond_2

    .line 183
    iget-object v1, p2, Ldcj;->n:[Ljava/lang/String;

    aget-object v1, v1, v4

    .line 13368
    if-eqz v1, :cond_2

    .line 13369
    iget-object v2, v0, Larz;->a:Landroid/widget/ImageView;

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 13370
    iget-object v2, v0, Larz;->i:Lart;

    .line 14042
    iget-object v2, v2, Lart;->f:Latf;

    .line 13371
    iget-object v3, v0, Larz;->a:Landroid/widget/ImageView;

    invoke-virtual {v2, v1, v3, v4}, Latf;->a(Ljava/lang/String;Landroid/widget/ImageView;Z)Laex;

    move-result-object v1

    iput-object v1, v0, Larz;->g:Laex;

    .line 185
    :cond_2
    iget-object v1, p2, Ldcj;->h:Ljava/lang/String;

    .line 14376
    if-eqz v1, :cond_3

    .line 14377
    iget-object v2, v0, Larz;->b:Landroid/widget/ImageView;

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 14378
    iget-object v2, v0, Larz;->i:Lart;

    .line 15042
    iget-object v2, v2, Lart;->f:Latf;

    .line 14378
    iget-object v3, v0, Larz;->b:Landroid/widget/ImageView;

    invoke-virtual {v2, v1, v3, v4}, Latf;->a(Ljava/lang/String;Landroid/widget/ImageView;Z)Laex;

    move-result-object v1

    iput-object v1, v0, Larz;->h:Laex;

    .line 186
    :cond_3
    iget-object v1, p2, Ldcj;->d:Ljava/lang/String;

    .line 15400
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 15401
    iget-object v2, v0, Larz;->f:Landroid/widget/TextView;

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15402
    iget-object v2, v0, Larz;->f:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 187
    :cond_4
    iget-object v1, p2, Ldcj;->e:[Ljava/lang/String;

    .line 16384
    const-string v2, "\n\n"

    invoke-static {v2, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 16385
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 16386
    iget-object v2, v0, Larz;->d:Landroid/widget/TextView;

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 16387
    iget-object v2, v0, Larz;->d:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 188
    :cond_5
    iget-object v1, p2, Ldcj;->f:[Ljava/lang/String;

    .line 16392
    const-string v2, "\n\n"

    invoke-static {v2, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 16393
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 16394
    iget-object v2, v0, Larz;->e:Landroid/widget/TextView;

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 16395
    iget-object v2, v0, Larz;->e:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    :cond_6
    iget-object v1, p2, Ldcj;->c:Ljava/lang/String;

    .line 16407
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 16408
    iget-object v2, v0, Larz;->c:Landroid/widget/TextView;

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 16409
    iget-object v2, v0, Larz;->c:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17195
    :cond_7
    new-instance v1, Laru;

    invoke-direct {v1, p0, p2}, Laru;-><init>(Lart;Ldcj;)V

    .line 17414
    iget-object v0, v0, Larz;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 191
    return-object p1
.end method


# virtual methods
.method public final getItemViewType(I)I
    .locals 3

    .prologue
    .line 81
    invoke-virtual {p0, p1}, Lart;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldcj;

    .line 82
    sget-object v1, Lart;->a:Ljava/util/Set;

    iget-object v2, v0, Ldcj;->a:Ljava/lang/Integer;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 83
    const/4 v0, 0x2

    .line 89
    :goto_0
    return v0

    .line 84
    :cond_0
    iget-object v1, v0, Ldcj;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x11

    if-ne v1, v2, :cond_1

    .line 85
    const/4 v0, 0x3

    goto :goto_0

    .line 86
    :cond_1
    iget-object v0, v0, Ldcj;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x12

    if-ne v0, v1, :cond_2

    .line 87
    const/4 v0, 0x4

    goto :goto_0

    .line 89
    :cond_2
    iget-boolean v0, p0, Lart;->d:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    const/16 v4, 0x1e

    const/4 v3, 0x0

    .line 100
    invoke-virtual {p0, p1}, Lart;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldcj;

    .line 101
    iget-object v1, p0, Lart;->e:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 103
    invoke-virtual {p0, p1}, Lart;->getItemViewType(I)I

    move-result v2

    .line 105
    if-nez p2, :cond_0

    .line 106
    packed-switch v2, :pswitch_data_0

    .line 125
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unknown item type: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 108
    :pswitch_0
    sget v2, La;->fA:I

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 109
    new-instance v2, Lasa;

    invoke-direct {v2, p0, v1}, Lasa;-><init>(Lart;Landroid/view/View;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 110
    invoke-direct {p0, v1, v0}, Lart;->a(Landroid/view/View;Ldcj;)Landroid/view/View;

    move-result-object p2

    .line 137
    :goto_0
    :pswitch_1
    return-object p2

    .line 112
    :pswitch_2
    sget v2, La;->fB:I

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 113
    new-instance v2, Lasa;

    invoke-direct {v2, p0, v1}, Lasa;-><init>(Lart;Landroid/view/View;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 114
    invoke-direct {p0, v1, v0}, Lart;->a(Landroid/view/View;Ldcj;)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    .line 116
    :pswitch_3
    sget v2, La;->fC:I

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 117
    new-instance v2, Larz;

    invoke-direct {v2, p0, v1}, Larz;-><init>(Lart;Landroid/view/View;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 118
    invoke-direct {p0, v1, v0}, Lart;->c(Landroid/view/View;Ldcj;)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    .line 120
    :pswitch_4
    sget v2, La;->fD:I

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 121
    invoke-static {v1, v0}, Lart;->b(Landroid/view/View;Ldcj;)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    .line 123
    :pswitch_5
    sget v0, La;->fX:I

    invoke-virtual {v1, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    .line 128
    :cond_0
    packed-switch v2, :pswitch_data_1

    .line 139
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unknown item type: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 131
    :pswitch_6
    invoke-direct {p0, p2, v0}, Lart;->a(Landroid/view/View;Ldcj;)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    .line 133
    :pswitch_7
    invoke-direct {p0, p2, v0}, Lart;->c(Landroid/view/View;Ldcj;)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    .line 135
    :pswitch_8
    invoke-static {p2, v0}, Lart;->b(Landroid/view/View;Ldcj;)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    .line 106
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch

    .line 128
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_1
    .end packed-switch
.end method

.method public final getViewTypeCount()I
    .locals 1

    .prologue
    .line 95
    const/4 v0, 0x5

    return v0
.end method

.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .prologue
    .line 306
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldcj;

    .line 307
    if-nez v0, :cond_0

    .line 311
    :goto_0
    return-void

    .line 310
    :cond_0
    invoke-direct {p0, v0, p2}, Lart;->a(Ldcj;Z)V

    goto :goto_0
.end method

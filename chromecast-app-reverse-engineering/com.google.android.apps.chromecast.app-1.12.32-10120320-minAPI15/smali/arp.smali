.class public final Larp;
.super Lj;
.source "PG"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;
.implements Lasq;
.implements Lasz;


# static fields
.field private static final b:[I

.field private static final c:Ljava/util/Set;

.field private static final d:Ljava/util/List;


# instance fields
.field private Z:Laqw;

.field public a:Lafm;

.field private aa:Landroid/view/View;

.field private ab:Landroid/widget/ViewFlipper;

.field private ac:Landroid/widget/ListView;

.field private ad:Landroid/widget/TextView;

.field private ae:Lart;

.field private af:Ldcj;

.field private ag:Landroid/support/v7/widget/SwitchCompat;

.field private ah:Z

.field private final ai:Lblp;

.field private aj:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/16 v2, 0xe

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 72
    new-array v0, v2, [I

    fill-array-data v0, :array_0

    sput-object v0, Larp;->b:[I

    .line 88
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Integer;

    .line 89
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    const/16 v2, 0xd

    .line 90
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v5

    const/4 v2, 0x2

    const/16 v3, 0xc

    .line 91
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const/16 v3, 0x10

    .line 92
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    .line 88
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Larp;->c:Ljava/util/Set;

    .line 94
    new-array v0, v5, [Ljava/lang/String;

    const-string v1, "user_photos"

    aput-object v1, v0, v4

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Larp;->d:Ljava/util/List;

    return-void

    .line 72
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x7
        0x9
        0xa
        0xb
        0xd
        0xe
        0xc
        0x10
        0x11
        0x12
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 64
    invoke-direct {p0}, Lj;-><init>()V

    .line 104
    const/4 v0, 0x1

    iput-boolean v0, p0, Larp;->ah:Z

    .line 106
    new-instance v0, Lblp;

    const-string v1, "BackdropSettingFragment"

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Larp;->ai:Lblp;

    .line 112
    iput-boolean v2, p0, Larp;->aj:Z

    return-void
.end method

.method public static a(Ldcj;)Larp;
    .locals 4

    .prologue
    .line 115
    new-instance v0, Larp;

    invoke-direct {v0}, Larp;-><init>()V

    .line 116
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 117
    if-eqz p0, :cond_0

    .line 118
    const-string v2, "userSettingMetadata"

    .line 119
    invoke-static {p0}, Ldcj;->a(Ldew;)[B

    move-result-object v3

    .line 118
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 121
    :cond_0
    invoke-virtual {v0, v1}, Larp;->f(Landroid/os/Bundle;)V

    .line 122
    return-object v0
.end method

.method static synthetic a(Larp;Ldcm;Ldcj;)Lbbw;
    .locals 7

    .prologue
    .line 64
    .line 18506
    new-instance v0, Lbbw;

    .line 18612
    iget-object v1, p0, Lj;->y:Lm;

    .line 18506
    invoke-static {v1}, Lblf;->z(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Larp;->Z:Laqw;

    .line 18507
    invoke-interface {v2}, Laqw;->r()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p2, Ldcj;->j:Ljava/lang/String;

    new-instance v5, Larr;

    invoke-direct {v5, p0}, Larr;-><init>(Larp;)V

    new-instance v6, Lars;

    invoke-direct {v6, p0}, Lars;-><init>(Larp;)V

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Lbbw;-><init>(Ljava/lang/String;Ljava/lang/String;Ldcm;Ljava/lang/String;Laea;Ladz;)V

    .line 64
    return-object v0
.end method

.method static synthetic a(Larp;)Lblp;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Larp;->ai:Lblp;

    return-object v0
.end method

.method static synthetic a(Larp;Lafb;)Ldcm;
    .locals 4

    .prologue
    .line 64
    .line 13172
    iget-object v0, p1, Lafb;->d:Ljava/lang/String;

    .line 12489
    if-eqz v0, :cond_0

    .line 13245
    iget-object v0, p1, Lafb;->h:Ljava/lang/String;

    .line 12489
    if-eqz v0, :cond_0

    .line 14181
    iget-object v0, p1, Lafb;->a:Ljava/util/Date;

    .line 12490
    if-nez v0, :cond_1

    .line 12491
    :cond_0
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 15172
    iget-object v2, p1, Lafb;->d:Ljava/lang/String;

    .line 12492
    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 15245
    iget-object v2, p1, Lafb;->h:Ljava/lang/String;

    .line 12492
    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 16181
    iget-object v2, p1, Lafb;->a:Ljava/util/Date;

    .line 12492
    aput-object v2, v0, v1

    .line 12493
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 12496
    :cond_1
    new-instance v0, Ldcm;

    invoke-direct {v0}, Ldcm;-><init>()V

    .line 17172
    iget-object v1, p1, Lafb;->d:Ljava/lang/String;

    .line 12497
    iput-object v1, v0, Ldcm;->b:Ljava/lang/String;

    .line 17245
    iget-object v1, p1, Lafb;->h:Ljava/lang/String;

    .line 12498
    iput-object v1, v0, Ldcm;->a:Ljava/lang/String;

    .line 18181
    iget-object v1, p1, Lafb;->a:Ljava/util/Date;

    .line 12499
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Ldcm;->c:Ljava/lang/Long;

    goto :goto_0
.end method

.method static synthetic b(Larp;)Laqw;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Larp;->Z:Laqw;

    return-object v0
.end method

.method public static b(Ldcj;)Ljava/util/List;
    .locals 1

    .prologue
    .line 443
    iget-object v0, p0, Ldcj;->m:[Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldcj;->m:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_0

    .line 445
    iget-object v0, p0, Ldcj;->m:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 447
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Larp;->d:Ljava/util/List;

    goto :goto_0
.end method

.method private q()V
    .locals 9

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 288
    iget-object v0, p0, Larp;->af:Ldcj;

    if-nez v0, :cond_1

    .line 8331
    iget-object v0, p0, Larp;->ab:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, v2}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    .line 9065
    iget-object v0, p0, Lj;->N:Landroid/view/View;

    .line 8332
    sget v3, Lf;->dd:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 8333
    sget v3, Lb;->dC:I

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    .line 295
    :goto_0
    iget-object v0, p0, Larp;->ab:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getDisplayedChild()I

    move-result v0

    if-nez v0, :cond_5

    .line 296
    iget-object v0, p0, Larp;->ae:Lart;

    invoke-virtual {v0}, Lart;->clear()V

    .line 297
    iget-object v0, p0, Larp;->af:Ldcj;

    iget-object v4, v0, Ldcj;->i:[Ldcj;

    array-length v5, v4

    move v3, v1

    :goto_1
    if-ge v3, v5, :cond_4

    aget-object v6, v4, v3

    .line 299
    iget-object v0, v6, Ldcj;->a:Ljava/lang/Integer;

    .line 9317
    if-eqz v0, :cond_3

    .line 9321
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move v0, v1

    .line 9322
    :goto_2
    sget-object v8, Larp;->b:[I

    array-length v8, v8

    if-ge v0, v8, :cond_3

    .line 9323
    sget-object v8, Larp;->b:[I

    aget v8, v8, v0

    if-ne v8, v7, :cond_2

    move v0, v2

    .line 299
    :goto_3
    if-eqz v0, :cond_0

    .line 300
    iget-object v0, p0, Larp;->ae:Lart;

    invoke-virtual {v0, v6}, Lart;->add(Ljava/lang/Object;)V

    .line 297
    :cond_0
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 291
    :cond_1
    iget-object v0, p0, Larp;->ab:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    .line 292
    iget-object v0, p0, Larp;->Z:Laqw;

    iget-object v3, p0, Larp;->af:Ldcj;

    iget-object v3, v3, Ldcj;->c:Ljava/lang/String;

    invoke-interface {v0, v3}, Laqw;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 9322
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    move v0, v1

    .line 9327
    goto :goto_3

    .line 303
    :cond_4
    iget-object v0, p0, Larp;->af:Ldcj;

    iget-object v0, v0, Ldcj;->d:Ljava/lang/String;

    if-eqz v0, :cond_6

    iget-object v0, p0, Larp;->ad:Landroid/widget/TextView;

    if-eqz v0, :cond_6

    .line 304
    iget-object v0, p0, Larp;->ad:Landroid/widget/TextView;

    iget-object v3, p0, Larp;->af:Ldcj;

    iget-object v3, v3, Ldcj;->d:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 305
    iget-object v0, p0, Larp;->ad:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 306
    iget-object v0, p0, Larp;->ac:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setHeaderDividersEnabled(Z)V

    .line 314
    :cond_5
    :goto_4
    return-void

    .line 308
    :cond_6
    iget-object v0, p0, Larp;->ad:Landroid/widget/TextView;

    if-eqz v0, :cond_7

    .line 309
    iget-object v0, p0, Larp;->ad:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 311
    :cond_7
    iget-object v0, p0, Larp;->ac:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setHeaderDividersEnabled(Z)V

    goto :goto_4
.end method

.method private r()Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 417
    iget-object v2, p0, Larp;->af:Ldcj;

    iget-object v3, v2, Ldcj;->k:[Ljava/lang/String;

    .line 418
    if-eqz v3, :cond_0

    array-length v2, v3

    if-lez v2, :cond_0

    .line 419
    array-length v4, v3

    move v2, v1

    :goto_0
    if-ge v2, v4, :cond_2

    aget-object v5, v3, v2

    .line 420
    iget-object v6, p0, Larp;->Z:Laqw;

    invoke-interface {v6}, Laqw;->h()Lash;

    move-result-object v6

    invoke-virtual {v6}, Lash;->s()Lauq;

    move-result-object v6

    invoke-virtual {v6, v5}, Lauq;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 426
    :cond_0
    :goto_1
    return v0

    .line 419
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    .line 424
    goto :goto_1
.end method

.method private s()Z
    .locals 2

    .prologue
    .line 431
    iget-object v0, p0, Larp;->af:Ldcj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Larp;->af:Ldcj;

    iget-object v0, v0, Ldcj;->b:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Larp;->Z:Laqw;

    .line 432
    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    invoke-virtual {v0}, Lash;->s()Lauq;

    move-result-object v0

    iget-object v1, p0, Larp;->af:Ldcj;

    iget-object v1, v1, Ldcj;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lauq;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x0

    .line 157
    iget-object v0, p0, Larp;->af:Ldcj;

    .line 4342
    if-eqz v0, :cond_3

    iget-object v1, v0, Ldcj;->s:Ljava/lang/Boolean;

    if-eqz v1, :cond_3

    .line 4343
    iget-object v0, v0, Ldcj;->s:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 159
    :goto_0
    new-instance v0, Lart;

    .line 4612
    iget-object v1, p0, Lj;->y:Lm;

    .line 159
    const v3, 0x1090003

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, Lart;-><init>(Landroid/content/Context;Lasz;ILjava/util/List;Z)V

    iput-object v0, p0, Larp;->ae:Lart;

    .line 163
    sget v0, La;->fE:I

    invoke-virtual {p1, v0, p2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 164
    sget v0, Lf;->aO:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Larp;->aa:Landroid/view/View;

    .line 165
    sget v0, Lf;->eu:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Larp;->ab:Landroid/widget/ViewFlipper;

    .line 166
    sget v0, Lf;->dD:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Larp;->ac:Landroid/widget/ListView;

    .line 167
    if-nez v5, :cond_0

    .line 170
    sget v0, La;->fw:I

    invoke-virtual {p1, v0, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Larp;->ad:Landroid/widget/TextView;

    .line 171
    iget-object v0, p0, Larp;->ac:Landroid/widget/ListView;

    iget-object v2, p0, Larp;->ad:Landroid/widget/TextView;

    invoke-virtual {v0, v2, v7, v6}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 174
    :cond_0
    if-eqz v5, :cond_1

    .line 5612
    iget-object v0, p0, Lj;->y:Lm;

    .line 176
    invoke-static {v0}, Lblx;->a(Landroid/app/Activity;)I

    move-result v0

    .line 177
    invoke-virtual {p0}, Larp;->e()Landroid/content/res/Resources;

    move-result-object v2

    .line 178
    sget v3, La;->dE:I

    .line 179
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    shl-int/lit8 v3, v3, 0x1

    sub-int/2addr v0, v3

    sget v3, La;->dD:I

    .line 180
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 178
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 181
    iget-object v0, p0, Larp;->ac:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 182
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 183
    iget-object v2, p0, Larp;->ac:Landroid/widget/ListView;

    invoke-virtual {v2, v0}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 186
    iget-object v0, p0, Larp;->ac:Landroid/widget/ListView;

    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setVerticalScrollBarEnabled(Z)V

    .line 188
    iget-object v0, p0, Larp;->ac:Landroid/widget/ListView;

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v2, v6}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 189
    iget-object v0, p0, Larp;->ac:Landroid/widget/ListView;

    .line 190
    invoke-virtual {p0}, Larp;->e()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, La;->dN:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 189
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 193
    :cond_1
    iget-object v0, p0, Larp;->ac:Landroid/widget/ListView;

    iget-object v2, p0, Larp;->ae:Lart;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 194
    iget-object v0, p0, Larp;->aa:Landroid/view/View;

    invoke-direct {p0}, Larp;->s()Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v6, 0x8

    :cond_2
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 195
    return-object v1

    .line 4346
    :cond_3
    if-eqz v0, :cond_5

    iget-object v1, v0, Ldcj;->i:[Ldcj;

    if-eqz v1, :cond_5

    .line 4347
    iget-object v1, v0, Ldcj;->i:[Ldcj;

    array-length v2, v1

    move v0, v6

    :goto_1
    if-ge v0, v2, :cond_5

    aget-object v3, v1, v0

    .line 4348
    iget-object v4, v3, Ldcj;->a:Ljava/lang/Integer;

    if-eqz v4, :cond_4

    sget-object v4, Larp;->c:Ljava/util/Set;

    iget-object v3, v3, Ldcj;->a:Ljava/lang/Integer;

    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 4349
    const/4 v5, 0x1

    goto/16 :goto_0

    .line 4347
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    move v5, v6

    .line 4354
    goto/16 :goto_0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 248
    invoke-super {p0}, Lj;->a()V

    .line 249
    const/4 v0, 0x0

    iput-object v0, p0, Larp;->a:Lafm;

    .line 250
    return-void
.end method

.method public final a(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 254
    invoke-super {p0, p1, p2, p3}, Lj;->a(IILandroid/content/Intent;)V

    .line 255
    iget-object v0, p0, Larp;->a:Lafm;

    if-eqz v0, :cond_0

    .line 256
    iget-object v0, p0, Larp;->a:Lafm;

    invoke-interface {v0, p1, p2, p3}, Lafm;->a(IILandroid/content/Intent;)Z

    .line 258
    :cond_0
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 127
    invoke-super {p0, p1}, Lj;->a(Landroid/app/Activity;)V

    .line 128
    invoke-static {}, Lafv;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 129
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lafv;->a(Landroid/content/Context;)V

    .line 131
    :cond_0
    iget-object v0, p0, Larp;->a:Lafm;

    if-nez v0, :cond_1

    .line 2051
    new-instance v0, Laik;

    invoke-direct {v0}, Laik;-><init>()V

    .line 132
    iput-object v0, p0, Larp;->a:Lafm;

    .line 134
    :cond_1
    check-cast p1, Laqw;

    iput-object p1, p0, Larp;->Z:Laqw;

    .line 135
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 149
    invoke-super {p0, p1}, Lj;->a(Landroid/os/Bundle;)V

    .line 150
    if-nez p1, :cond_0

    .line 2559
    iget-object p1, p0, Lj;->m:Landroid/os/Bundle;

    .line 3358
    :cond_0
    if-eqz p1, :cond_1

    .line 3359
    const-string v0, "userSettingMetadata"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v0

    .line 3360
    iget-object v1, p0, Larp;->af:Ldcj;

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    .line 3362
    :try_start_0
    invoke-static {v0}, Ldcj;->a([B)Ldcj;

    move-result-object v0

    iput-object v0, p0, Larp;->af:Ldcj;
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 3365
    :cond_1
    :goto_0
    return-void

    .line 3363
    :catch_0
    move-exception v0

    .line 3364
    iget-object v1, p0, Larp;->ai:Lblp;

    const-string v2, "Could not load user setting metadata: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final a(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 2

    .prologue
    .line 262
    sget v0, La;->gW:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 263
    sget v0, Lf;->bJ:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 264
    invoke-direct {p0}, Larp;->s()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, p0, v1}, Lasr;->a(Landroid/view/MenuItem;Landroid/widget/CompoundButton$OnCheckedChangeListener;Ljava/lang/Boolean;)Landroid/support/v7/widget/SwitchCompat;

    move-result-object v0

    iput-object v0, p0, Larp;->ag:Landroid/support/v7/widget/SwitchCompat;

    .line 265
    invoke-super {p0, p1, p2}, Lj;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 266
    invoke-direct {p0}, Larp;->q()V

    .line 267
    return-void
.end method

.method public final a_(I)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 383
    iget-object v0, p0, Larp;->Z:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    .line 384
    const/4 v1, 0x4

    if-ne p1, v1, :cond_3

    .line 386
    iget-object v1, p0, Larp;->af:Ldcj;

    if-nez v1, :cond_2

    .line 387
    invoke-virtual {v0}, Lash;->t()Laur;

    move-result-object v0

    .line 10037
    iget-object v0, v0, Laur;->b:Ldcj;

    .line 387
    iput-object v0, p0, Larp;->af:Ldcj;

    .line 388
    iget-object v0, p0, Larp;->af:Ldcj;

    if-nez v0, :cond_1

    .line 10612
    iget-object v0, p0, Lj;->y:Lm;

    .line 10808
    iget-object v0, v0, Lm;->b:Lt;

    .line 10437
    invoke-virtual {v0}, Lr;->c()V

    .line 11612
    iget-object v0, p0, Lj;->y:Lm;

    .line 10438
    sget v1, Lb;->aa:I

    invoke-virtual {p0, v1}, Larp;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 10439
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 410
    :cond_0
    :goto_0
    return-void

    .line 391
    :cond_1
    invoke-direct {p0}, Larp;->q()V

    goto :goto_0

    .line 394
    :cond_2
    iget-object v1, p0, Larp;->af:Ldcj;

    iget-object v1, v1, Ldcj;->j:Ljava/lang/String;

    .line 395
    invoke-virtual {v0, v1}, Lash;->b(Ljava/lang/String;)Ldcj;

    move-result-object v0

    iput-object v0, p0, Larp;->af:Ldcj;

    .line 396
    invoke-direct {p0}, Larp;->q()V

    goto :goto_0

    .line 398
    :cond_3
    if-ne p1, v2, :cond_4

    .line 399
    invoke-direct {p0}, Larp;->q()V

    goto :goto_0

    .line 400
    :cond_4
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Larp;->af:Ldcj;

    if-eqz v0, :cond_0

    .line 401
    iget-object v0, p0, Larp;->af:Ldcj;

    iget-object v0, v0, Ldcj;->j:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 402
    iget-object v0, p0, Larp;->ag:Landroid/support/v7/widget/SwitchCompat;

    if-eqz v0, :cond_6

    .line 403
    iget-object v0, p0, Larp;->ag:Landroid/support/v7/widget/SwitchCompat;

    invoke-direct {p0}, Larp;->s()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V

    .line 408
    :cond_5
    :goto_1
    iget-object v0, p0, Larp;->ae:Lart;

    invoke-virtual {v0}, Lart;->notifyDataSetChanged()V

    goto :goto_0

    .line 404
    :cond_6
    iget-object v0, p0, Larp;->ag:Landroid/support/v7/widget/SwitchCompat;

    if-nez v0, :cond_5

    .line 405
    invoke-direct {p0}, Larp;->q()V

    goto :goto_1
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 139
    invoke-super {p0, p1}, Lj;->e(Landroid/os/Bundle;)V

    .line 140
    iget-object v0, p0, Larp;->af:Ldcj;

    if-eqz v0, :cond_0

    .line 141
    const-string v0, "userSettingMetadata"

    iget-object v1, p0, Larp;->af:Ldcj;

    .line 142
    invoke-static {v1}, Ldcj;->a(Ldew;)[B

    move-result-object v1

    .line 141
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 144
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Larp;->ah:Z

    .line 145
    return-void
.end method

.method public final j()V
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 200
    invoke-super {p0}, Lj;->j()V

    .line 201
    iget-object v2, p0, Larp;->Z:Laqw;

    invoke-interface {v2}, Laqw;->h()Lash;

    move-result-object v2

    invoke-virtual {v2, p0}, Lash;->a(Lasq;)V

    .line 203
    iput-boolean v0, p0, Larp;->ah:Z

    .line 205
    iget-object v2, p0, Larp;->af:Ldcj;

    if-eqz v2, :cond_0

    iget-object v2, p0, Larp;->af:Ldcj;

    iget-object v2, v2, Ldcj;->b:Ljava/lang/Integer;

    if-eqz v2, :cond_0

    .line 207
    :goto_0
    iget-object v2, p0, Larp;->ag:Landroid/support/v7/widget/SwitchCompat;

    if-eqz v2, :cond_2

    .line 208
    if-eqz v0, :cond_1

    .line 209
    iget-object v0, p0, Larp;->ag:Landroid/support/v7/widget/SwitchCompat;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SwitchCompat;->setVisibility(I)V

    .line 210
    iget-object v0, p0, Larp;->ag:Landroid/support/v7/widget/SwitchCompat;

    invoke-direct {p0}, Larp;->s()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V

    .line 211
    iget-object v0, p0, Larp;->ag:Landroid/support/v7/widget/SwitchCompat;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/SwitchCompat;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 219
    :goto_1
    invoke-direct {p0}, Larp;->q()V

    .line 220
    return-void

    :cond_0
    move v0, v1

    .line 205
    goto :goto_0

    .line 213
    :cond_1
    iget-object v0, p0, Larp;->ag:Landroid/support/v7/widget/SwitchCompat;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SwitchCompat;->setVisibility(I)V

    .line 214
    const/4 v0, 0x0

    iput-object v0, p0, Larp;->ag:Landroid/support/v7/widget/SwitchCompat;

    goto :goto_1

    .line 217
    :cond_2
    invoke-virtual {p0, v0}, Larp;->d(Z)V

    goto :goto_1
.end method

.method public final k()V
    .locals 1

    .prologue
    .line 224
    invoke-super {p0}, Lj;->k()V

    .line 225
    iget-object v0, p0, Larp;->Z:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    invoke-virtual {v0, p0}, Lash;->b(Lasq;)V

    .line 226
    return-void
.end method

.method public final l()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 230
    invoke-super {p0}, Lj;->l()V

    .line 233
    iget-object v0, p0, Larp;->Z:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    invoke-virtual {v0}, Lash;->s()Lauq;

    move-result-object v0

    .line 234
    iget-boolean v1, p0, Larp;->ah:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Larp;->af:Ldcj;

    if-eqz v1, :cond_0

    iget-object v1, p0, Larp;->af:Ldcj;

    iget-object v1, v1, Ldcj;->j:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 236
    invoke-direct {p0}, Larp;->r()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Larp;->af:Ldcj;

    iget-object v1, v1, Ldcj;->j:Ljava/lang/String;

    .line 237
    invoke-virtual {v0, v1}, Lauq;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 238
    iget-object v1, p0, Larp;->af:Ldcj;

    iget-object v1, v1, Ldcj;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Lauq;->a(Ljava/lang/String;Z)V

    .line 239
    iget-object v0, p0, Larp;->Z:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lash;->b(I)V

    .line 6612
    iget-object v0, p0, Lj;->y:Lm;

    .line 240
    invoke-virtual {v0}, Lm;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lb;->ai:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Larp;->af:Ldcj;

    iget-object v3, v3, Ldcj;->c:Ljava/lang/String;

    aput-object v3, v2, v4

    .line 241
    invoke-virtual {p0, v1, v2}, Larp;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 240
    invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 242
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 244
    :cond_0
    return-void
.end method

.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 271
    iget-object v1, p0, Larp;->ag:Landroid/support/v7/widget/SwitchCompat;

    if-ne p1, v1, :cond_0

    .line 272
    invoke-direct {p0}, Larp;->q()V

    .line 273
    iget-boolean v1, p0, Larp;->aj:Z

    if-eqz v1, :cond_1

    .line 274
    iput-boolean v0, p0, Larp;->aj:Z

    .line 278
    :goto_0
    iget-object v0, p0, Larp;->Z:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    invoke-virtual {v0}, Lash;->s()Lauq;

    move-result-object v0

    iget-object v1, p0, Larp;->af:Ldcj;

    iget-object v1, v1, Ldcj;->j:Ljava/lang/String;

    .line 279
    invoke-virtual {v0, v1, p2}, Lauq;->a(Ljava/lang/String;Z)V

    .line 280
    iget-object v0, p0, Larp;->Z:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    .line 7549
    iget-object v0, v0, Lash;->d:Lasb;

    invoke-virtual {v0}, Lasb;->a()V

    .line 281
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    new-instance v1, Lapd;

    const/16 v2, 0x4c

    invoke-direct {v1, v2}, Lapd;-><init>(I)V

    iget-object v2, p0, Larp;->af:Ldcj;

    iget-object v2, v2, Ldcj;->b:Ljava/lang/Integer;

    .line 283
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    .line 281
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 285
    :cond_0
    return-void

    .line 276
    :cond_1
    iget-object v1, p0, Larp;->aa:Landroid/view/View;

    if-eqz p2, :cond_2

    const/16 v0, 0x8

    :cond_2
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public final p()V
    .locals 3

    .prologue
    .line 372
    invoke-direct {p0}, Larp;->r()Z

    move-result v0

    .line 373
    iget-object v1, p0, Larp;->ag:Landroid/support/v7/widget/SwitchCompat;

    if-eqz v1, :cond_0

    iget-object v1, p0, Larp;->ag:Landroid/support/v7/widget/SwitchCompat;

    invoke-virtual {v1}, Landroid/support/v7/widget/SwitchCompat;->isChecked()Z

    move-result v1

    if-eq v1, v0, :cond_0

    .line 374
    const/4 v1, 0x1

    iput-boolean v1, p0, Larp;->aj:Z

    .line 375
    iget-object v1, p0, Larp;->ag:Landroid/support/v7/widget/SwitchCompat;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V

    .line 376
    iget-object v1, p0, Larp;->Z:Laqw;

    invoke-interface {v1}, Laqw;->h()Lash;

    move-result-object v1

    invoke-virtual {v1}, Lash;->s()Lauq;

    move-result-object v1

    iget-object v2, p0, Larp;->af:Ldcj;

    iget-object v2, v2, Ldcj;->j:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lauq;->a(Ljava/lang/String;Z)V

    .line 379
    :cond_0
    return-void
.end method

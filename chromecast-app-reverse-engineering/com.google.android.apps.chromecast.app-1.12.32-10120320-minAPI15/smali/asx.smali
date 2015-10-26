.class public final Lasx;
.super Lam;
.source "PG"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;
.implements Larg;
.implements Larh;
.implements Lasq;
.implements Lasz;


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private final Z:Lblp;

.field private aa:Laqw;

.field private ab:Lard;

.field private ac:Lark;

.field private ad:Z

.field private ae:Landroid/widget/CompoundButton;

.field private af:Llw;

.field private ag:Landroid/view/View;

.field private ah:Landroid/widget/ViewFlipper;

.field private ai:Landroid/view/View;

.field private aj:Landroid/widget/TextView;

.field private ak:Landroid/widget/ListView;

.field private al:Z

.field private am:Ldcj;

.field private an:Z

.field private c:I

.field private d:Landroid/view/MenuItem;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 62
    const/4 v0, 0x0

    sput-object v0, Lasx;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 45
    invoke-direct {p0}, Lam;-><init>()V

    .line 68
    new-instance v0, Lblp;

    const-string v1, "PhotosFragment"

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lasx;->Z:Lblp;

    .line 87
    const/4 v0, 0x1

    iput-boolean v0, p0, Lasx;->al:Z

    .line 95
    iput-boolean v2, p0, Lasx;->an:Z

    return-void
.end method

.method static synthetic a(Lasx;)I
    .locals 1

    .prologue
    .line 45
    iget v0, p0, Lasx;->c:I

    return v0
.end method

.method public static a(Ldcj;)Lasx;
    .locals 1

    .prologue
    .line 98
    const-string v0, ""

    invoke-static {p0, v0}, Lasx;->a(Ldcj;Ljava/lang/String;)Lasx;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ldcj;Ljava/lang/String;)Lasx;
    .locals 4

    .prologue
    .line 102
    new-instance v0, Lasx;

    invoke-direct {v0}, Lasx;-><init>()V

    .line 103
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 104
    const-string v2, "photoSettingDescription"

    iget-object v3, p0, Ldcj;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    const-string v2, "settingMetadata"

    invoke-static {p0}, Ldcj;->a(Ldew;)[B

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 106
    const-string v2, "targetUser"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    const/4 v2, 0x0

    iget-object v3, p0, Ldcj;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    invoke-virtual {v0, v1}, Lasx;->f(Landroid/os/Bundle;)V

    .line 109
    return-object v0
.end method

.method static synthetic a(Lasx;I)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1}, Lasx;->b(I)V

    return-void
.end method

.method private a(Z)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 357
    iget-object v0, p0, Lasx;->ak:Landroid/widget/ListView;

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setFocusable(Z)V

    .line 364
    iget-object v0, p0, Lasx;->ab:Lard;

    .line 13286
    iget-boolean v3, v0, Lard;->f:Z

    .line 365
    iget-object v4, p0, Lasx;->af:Llw;

    if-eqz p1, :cond_0

    if-nez v3, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {v4, v0}, Llw;->setEnabled(Z)V

    .line 367
    if-eqz p1, :cond_1

    if-eqz v3, :cond_1

    iget-object v0, p0, Lasx;->af:Llw;

    .line 13518
    iget-boolean v0, v0, Llw;->b:Z

    .line 367
    if-nez v0, :cond_1

    .line 14410
    iget-object v0, p0, Lasx;->ah:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, v2}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    .line 15065
    iget-object v0, p0, Lj;->N:Landroid/view/View;

    .line 14411
    sget v1, Lf;->dd:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 14412
    sget v1, Lb;->cJ:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 380
    :goto_1
    return-void

    :cond_0
    move v0, v2

    .line 365
    goto :goto_0

    .line 370
    :cond_1
    iget-object v0, p0, Lasx;->ai:Landroid/view/View;

    if-nez v0, :cond_2

    .line 15612
    iget-object v0, p0, Lj;->y:Lm;

    .line 371
    const-string v2, "layout_inflater"

    .line 372
    invoke-virtual {v0, v2}, Lm;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    sget v2, La;->gl:I

    const/4 v3, 0x0

    .line 373
    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lasx;->ai:Landroid/view/View;

    .line 374
    iget-object v0, p0, Lasx;->ai:Landroid/view/View;

    sget v2, Lf;->cl:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lasx;->aj:Landroid/widget/TextView;

    .line 375
    iget-object v0, p0, Lasx;->ah:Landroid/widget/ViewFlipper;

    iget-object v2, p0, Lasx;->ai:Landroid/view/View;

    invoke-virtual {v0, v2, v1}, Landroid/widget/ViewFlipper;->addView(Landroid/view/View;I)V

    .line 377
    :cond_2
    iget-object v0, p0, Lasx;->aj:Landroid/widget/TextView;

    sget v2, Lb;->bO:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 378
    iget-object v0, p0, Lasx;->ah:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    goto :goto_1
.end method

.method private b(I)V
    .locals 2

    .prologue
    .line 402
    iget-object v0, p0, Lasx;->ab:Lard;

    .line 17286
    iget-boolean v0, v0, Lard;->f:Z

    .line 402
    if-nez v0, :cond_0

    .line 403
    iget-object v0, p0, Lasx;->af:Llw;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Llw;->a(Z)V

    .line 404
    iget-object v0, p0, Lasx;->ab:Lard;

    .line 18262
    iput p1, v0, Lard;->h:I

    .line 405
    iget-object v0, p0, Lasx;->ab:Lard;

    invoke-virtual {v0}, Lard;->a()V

    .line 407
    :cond_0
    return-void
.end method

.method private b(Z)V
    .locals 2

    .prologue
    .line 383
    iget-object v0, p0, Lasx;->aa:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    invoke-virtual {v0}, Lash;->s()Lauq;

    move-result-object v0

    .line 384
    iget-object v1, p0, Lasx;->am:Ldcj;

    iget-object v1, v1, Ldcj;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lauq;->a(Ljava/lang/String;)Z

    move-result v1

    if-eq v1, p1, :cond_0

    .line 385
    iget-object v1, p0, Lasx;->am:Ldcj;

    iget-object v1, v1, Ldcj;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lauq;->a(Ljava/lang/String;Z)V

    .line 386
    iget-object v0, p0, Lasx;->aa:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    .line 16549
    iget-object v0, v0, Lash;->d:Lasb;

    invoke-virtual {v0}, Lasb;->a()V

    .line 388
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 11

    .prologue
    const/4 v7, 0x4

    const/4 v10, 0x1

    const/4 v8, 0x0

    .line 127
    sget v0, La;->fz:I

    invoke-virtual {p1, v0, p2, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v9

    .line 1612
    iget-object v0, p0, Lj;->y:Lm;

    .line 129
    invoke-static {v0}, Lblx;->a(Landroid/app/Activity;)I

    move-result v0

    .line 130
    invoke-virtual {p0}, Lasx;->e()Landroid/content/res/Resources;

    move-result-object v1

    .line 131
    sget v2, La;->dE:I

    .line 132
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    shl-int/lit8 v2, v2, 0x1

    sub-int/2addr v0, v2

    sget v2, La;->dD:I

    .line 133
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 131
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 134
    const v0, 0x102000a

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lasx;->ak:Landroid/widget/ListView;

    .line 135
    iget-object v0, p0, Lasx;->ak:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 136
    iput v6, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 137
    iget-object v1, p0, Lasx;->ak:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 139
    sget v0, Lf;->dm:I

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Llw;

    iput-object v0, p0, Lasx;->af:Llw;

    .line 140
    iget-object v1, p0, Lasx;->af:Llw;

    new-array v2, v7, [I

    sget v0, La;->du:I

    aput v0, v2, v8

    sget v0, La;->dv:I

    aput v0, v2, v10

    const/4 v0, 0x2

    sget v3, La;->dw:I

    aput v3, v2, v0

    const/4 v0, 0x3

    sget v3, La;->dx:I

    aput v3, v2, v0

    .line 2493
    invoke-virtual {v1}, Llw;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 2494
    new-array v4, v7, [I

    move v0, v8

    .line 2495
    :goto_0
    if-ge v0, v7, :cond_0

    .line 2496
    aget v5, v2, v0

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    aput v5, v4, v0

    .line 2495
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2509
    :cond_0
    invoke-virtual {v1}, Llw;->a()V

    .line 2510
    iget-object v0, v1, Llw;->e:Lli;

    .line 3211
    iget-object v1, v0, Lli;->a:Llm;

    invoke-virtual {v1, v4}, Llm;->a([I)V

    .line 3212
    iget-object v0, v0, Lli;->a:Llm;

    invoke-virtual {v0, v8}, Llm;->a(I)V

    .line 145
    iget-object v0, p0, Lasx;->af:Llw;

    new-instance v1, Lasy;

    invoke-direct {v1, p0}, Lasy;-><init>(Lasx;)V

    .line 3324
    iput-object v1, v0, Llw;->a:Lme;

    .line 3559
    :try_start_0
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 155
    const-string v1, "settingMetadata"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v0

    .line 154
    invoke-static {v0}, Ldcj;->a([B)Ldcj;

    move-result-object v0

    iput-object v0, p0, Lasx;->am:Ldcj;
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    const v0, 0x1020004

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Lasx;->ah:Landroid/widget/ViewFlipper;

    .line 163
    sget v0, Lf;->aO:I

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lasx;->ag:Landroid/view/View;

    .line 164
    iget-object v1, p0, Lasx;->ag:Landroid/view/View;

    iget-object v0, p0, Lasx;->aa:Laqw;

    .line 165
    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    invoke-virtual {v0}, Lash;->s()Lauq;

    move-result-object v0

    iget-object v2, p0, Lasx;->am:Ldcj;

    iget-object v2, v2, Ldcj;->j:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lauq;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 166
    const/16 v0, 0x8

    .line 164
    :goto_1
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 167
    iget-object v0, p0, Lasx;->aa:Laqw;

    .line 4559
    iget-object v1, p0, Lj;->m:Landroid/os/Bundle;

    .line 167
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Laqw;->c(Ljava/lang/String;)V

    .line 169
    new-instance v0, Lard;

    .line 4612
    iget-object v1, p0, Lj;->y:Lm;

    .line 169
    iget-object v2, p0, Lasx;->aa:Laqw;

    invoke-interface {v2}, Laqw;->h()Lash;

    move-result-object v2

    iget-object v4, p0, Lasx;->am:Ldcj;

    .line 5559
    iget-object v3, p0, Lj;->m:Landroid/os/Bundle;

    .line 170
    const-string v5, "targetUser"

    invoke-virtual {v3, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget v7, p0, Lasx;->c:I

    move-object v3, p0

    invoke-direct/range {v0 .. v7}, Lard;-><init>(Landroid/content/Context;Lash;Lasz;Ldcj;Ljava/lang/String;II)V

    iput-object v0, p0, Lasx;->ab:Lard;

    .line 172
    iget-object v0, p0, Lasx;->aa:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    iget-object v1, p0, Lasx;->ab:Lard;

    invoke-virtual {v0, v1}, Lash;->a(Lasq;)V

    .line 173
    iget-object v0, p0, Lasx;->ak:Landroid/widget/ListView;

    iget-object v1, p0, Lasx;->ab:Lard;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 174
    invoke-virtual {p0, v10}, Lasx;->d(Z)V

    .line 176
    iget-object v0, p0, Lasx;->aa:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    invoke-virtual {v0}, Lash;->s()Lauq;

    move-result-object v0

    iget-object v1, p0, Lasx;->am:Ldcj;

    iget-object v1, v1, Ldcj;->j:Ljava/lang/String;

    .line 177
    invoke-virtual {v0, v1}, Lauq;->a(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lasx;->ad:Z

    .line 178
    if-eqz p3, :cond_1

    .line 179
    const-string v0, "sortOptionState"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lasx;->c:I

    .line 180
    const-string v0, "photoSettingsState"

    iget-boolean v1, p0, Lasx;->ad:Z

    .line 181
    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lasx;->ad:Z

    .line 182
    const-string v0, "userRequestedRefresh"

    invoke-virtual {p3, v0, v8}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 183
    iget-object v0, p0, Lasx;->af:Llw;

    invoke-virtual {v0, v10}, Llw;->a(Z)V

    .line 184
    iget v0, p0, Lasx;->c:I

    invoke-direct {p0, v0}, Lasx;->b(I)V

    :cond_1
    move-object v0, v9

    .line 187
    :goto_2
    return-object v0

    .line 156
    :catch_0
    move-exception v0

    .line 157
    iget-object v1, p0, Lasx;->Z:Lblp;

    const-string v2, "Could not load user setting metadata: %s"

    new-array v3, v10, [Ljava/lang/Object;

    aput-object v0, v3, v8

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3669
    iget-object v0, p0, Lj;->x:Lt;

    .line 158
    invoke-virtual {v0}, Lr;->c()V

    move-object v0, v9

    .line 159
    goto :goto_2

    :cond_2
    move v0, v8

    .line 166
    goto/16 :goto_1
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 120
    invoke-super {p0}, Lam;->a()V

    .line 121
    const/4 v0, 0x0

    iput-object v0, p0, Lasx;->aa:Laqw;

    .line 122
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 114
    invoke-super {p0, p1}, Lam;->a(Landroid/app/Activity;)V

    .line 115
    check-cast p1, Laqw;

    iput-object p1, p0, Lasx;->aa:Laqw;

    .line 116
    return-void
.end method

.method public final a(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 10

    .prologue
    const/4 v1, 0x0

    const/4 v9, 0x1

    .line 193
    sget v0, Lf;->bS:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v9}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 196
    iget-object v0, p0, Lasx;->am:Ldcj;

    iget-object v0, v0, Ldcj;->i:[Ldcj;

    aget-object v0, v0, v1

    iget-object v0, v0, Ldcj;->p:[Ldcf;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lasx;->am:Ldcj;

    iget-object v0, v0, Ldcj;->i:[Ldcj;

    aget-object v0, v0, v1

    iget-object v0, v0, Ldcj;->p:[Ldcf;

    array-length v0, v0

    if-lez v0, :cond_2

    .line 198
    sget v0, La;->hc:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 199
    sget v0, Lf;->bW:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v9}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 201
    sget v0, Lf;->bW:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v2

    .line 203
    iget-object v0, p0, Lasx;->am:Ldcj;

    iget-object v0, v0, Ldcj;->i:[Ldcj;

    aget-object v0, v0, v1

    iget-object v3, v0, Ldcj;->p:[Ldcf;

    array-length v4, v3

    move v0, v1

    :goto_0
    if-ge v0, v4, :cond_1

    aget-object v5, v3, v0

    .line 204
    sget v6, Lf;->dT:I

    iget-object v7, v5, Ldcf;->a:Ljava/lang/Integer;

    .line 205
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v8, v5, Ldcf;->b:Ljava/lang/String;

    .line 204
    invoke-interface {v2, v6, v7, v1, v8}, Landroid/view/SubMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v6

    .line 207
    invoke-interface {v6, v9}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object v6

    .line 208
    iget-object v7, v5, Ldcf;->c:Ljava/lang/Boolean;

    if-eqz v7, :cond_0

    iget-object v5, v5, Ldcf;->c:Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 209
    invoke-interface {v6, v9}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 210
    iput-object v6, p0, Lasx;->d:Landroid/view/MenuItem;

    .line 203
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 213
    :cond_1
    sget v0, Lf;->dT:I

    invoke-interface {v2, v0, v9, v9}, Landroid/view/SubMenu;->setGroupCheckable(IZZ)V

    .line 216
    :cond_2
    sget v0, La;->gW:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 217
    sget v0, Lf;->bJ:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 218
    iget-boolean v1, p0, Lasx;->ad:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, p0, v1}, Lasr;->a(Landroid/view/MenuItem;Landroid/widget/CompoundButton$OnCheckedChangeListener;Ljava/lang/Boolean;)Landroid/support/v7/widget/SwitchCompat;

    move-result-object v0

    iput-object v0, p0, Lasx;->ae:Landroid/widget/CompoundButton;

    .line 219
    return-void
.end method

.method public final a(Landroid/view/View;I)V
    .locals 6

    .prologue
    .line 316
    sget v0, Lf;->Y:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 317
    invoke-virtual {v0}, Landroid/widget/CheckBox;->toggle()V

    .line 321
    iget-object v1, p0, Lasx;->ab:Lard;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    .line 9413
    invoke-virtual {v1, p2}, Lard;->b(I)Ldbq;

    move-result-object v2

    .line 9415
    iget-object v3, v1, Lard;->a:Ljava/util/HashMap;

    monitor-enter v3

    .line 9416
    :try_start_0
    iget-object v4, v2, Ldbq;->a:Ljava/lang/Long;

    .line 9417
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v2, Ldbq;->e:Ljava/lang/String;

    .line 9416
    invoke-virtual {v1, v4, v5}, Lard;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 9418
    if-eqz v0, :cond_2

    .line 9419
    new-instance v0, Ldca;

    invoke-direct {v0}, Ldca;-><init>()V

    .line 9420
    iget-object v5, v2, Ldbq;->a:Ljava/lang/Long;

    if-eqz v5, :cond_0

    .line 9421
    iget-object v5, v2, Ldbq;->a:Ljava/lang/Long;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v0, Ldca;->a:Ljava/lang/String;

    .line 9423
    :cond_0
    iget-object v2, v2, Ldbq;->e:Ljava/lang/String;

    iput-object v2, v0, Ldca;->b:Ljava/lang/String;

    .line 9424
    iget-object v2, v1, Lard;->a:Ljava/util/HashMap;

    invoke-virtual {v2, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9430
    :goto_0
    iget-object v0, v1, Lard;->b:Lash;

    invoke-virtual {v0}, Lash;->s()Lauq;

    move-result-object v2

    iget-object v4, v1, Lard;->g:Ljava/lang/String;

    iget-object v0, v1, Lard;->a:Ljava/util/HashMap;

    .line 9432
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v5, v1, Lard;->a:Ljava/util/HashMap;

    invoke-virtual {v5}, Ljava/util/HashMap;->size()I

    move-result v5

    new-array v5, v5, [Ldca;

    invoke-interface {v0, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldca;

    .line 10073
    invoke-virtual {v2, v4}, Lauq;->c(Ljava/lang/String;)Ldci;

    move-result-object v2

    iput-object v0, v2, Ldci;->b:[Ldca;

    .line 9433
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9434
    iget-object v0, v1, Lard;->b:Lash;

    .line 10549
    iget-object v0, v0, Lash;->d:Lasb;

    invoke-virtual {v0}, Lasb;->a()V

    .line 9435
    iget-object v0, v1, Lard;->e:Lasz;

    if-eqz v0, :cond_1

    .line 9436
    iget-object v0, v1, Lard;->e:Lasz;

    invoke-interface {v0}, Lasz;->p()V

    .line 322
    :cond_1
    iget-object v0, p0, Lasx;->ab:Lard;

    .line 11444
    iget-object v0, v0, Lard;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    .line 322
    if-eqz v0, :cond_3

    const/4 v0, 0x1

    :goto_1
    invoke-direct {p0, v0}, Lasx;->b(Z)V

    .line 323
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    new-instance v1, Lapd;

    const/16 v2, 0x4c

    invoke-direct {v1, v2}, Lapd;-><init>(I)V

    iget-object v2, p0, Lasx;->am:Ldcj;

    iget-object v2, v2, Ldcj;->b:Ljava/lang/Integer;

    .line 325
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    .line 323
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 326
    return-void

    .line 9426
    :cond_2
    :try_start_1
    iget-object v0, v1, Lard;->a:Ljava/util/HashMap;

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9427
    iget-object v0, v1, Lard;->i:Ljava/util/Set;

    iget-object v2, v2, Ldbq;->a:Ljava/lang/Long;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9433
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 322
    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;Ljava/lang/String;I)V
    .locals 3

    .prologue
    .line 418
    invoke-static/range {p1 .. p6}, Lark;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;Ljava/lang/String;I)Lark;

    move-result-object v0

    iput-object v0, p0, Lasx;->ac:Lark;

    .line 420
    iget-object v0, p0, Lasx;->ac:Lark;

    .line 18612
    iget-object v1, p0, Lj;->y:Lm;

    .line 18808
    iget-object v1, v1, Lm;->b:Lt;

    .line 421
    const-string v2, "backdropPreviewFragment"

    .line 420
    invoke-virtual {v0, v1, v2}, Lark;->a(Lr;Ljava/lang/String;)V

    .line 422
    return-void
.end method

.method public final a(Landroid/view/MenuItem;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 223
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    sget v2, Lf;->bS:I

    if-ne v1, v2, :cond_0

    .line 224
    iget v1, p0, Lasx;->c:I

    invoke-direct {p0, v1}, Lasx;->b(I)V

    .line 243
    :goto_0
    return v0

    .line 226
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    sget v2, Lf;->bW:I

    if-ne v1, v2, :cond_1

    .line 227
    iget-object v1, p0, Lasx;->d:Landroid/view/MenuItem;

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    goto :goto_0

    .line 229
    :cond_1
    invoke-interface {p1}, Landroid/view/MenuItem;->getGroupId()I

    move-result v1

    sget v2, Lf;->dT:I

    if-ne v1, v2, :cond_3

    .line 230
    iget-object v1, p0, Lasx;->d:Landroid/view/MenuItem;

    if-ne v1, p1, :cond_2

    .line 231
    iget v1, p0, Lasx;->c:I

    invoke-direct {p0, v1}, Lasx;->b(I)V

    goto :goto_0

    .line 235
    :cond_2
    iget-object v1, p0, Lasx;->d:Landroid/view/MenuItem;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 236
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 237
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    iput v1, p0, Lasx;->c:I

    .line 238
    iput-object p1, p0, Lasx;->d:Landroid/view/MenuItem;

    .line 239
    iget v1, p0, Lasx;->c:I

    invoke-direct {p0, v1}, Lasx;->b(I)V

    goto :goto_0

    .line 243
    :cond_3
    invoke-super {p0, p1}, Lam;->a(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method

.method public final a_(I)V
    .locals 2

    .prologue
    .line 299
    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    .line 300
    iget-object v0, p0, Lasx;->aa:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    invoke-virtual {v0}, Lash;->s()Lauq;

    move-result-object v0

    iget-object v1, p0, Lasx;->am:Ldcj;

    iget-object v1, v1, Ldcj;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lauq;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 301
    iget-object v0, p0, Lasx;->ae:Landroid/widget/CompoundButton;

    if-eqz v0, :cond_0

    .line 302
    iget-object v0, p0, Lasx;->ae:Landroid/widget/CompoundButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 305
    :cond_0
    iget-object v0, p0, Lasx;->ae:Landroid/widget/CompoundButton;

    if-nez v0, :cond_2

    .line 306
    iget-boolean v0, p0, Lasx;->ad:Z

    .line 305
    :goto_0
    invoke-direct {p0, v0}, Lasx;->a(Z)V

    .line 310
    :cond_1
    :goto_1
    return-void

    .line 306
    :cond_2
    iget-object v0, p0, Lasx;->ae:Landroid/widget/CompoundButton;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    goto :goto_0

    .line 307
    :cond_3
    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    .line 308
    iget-object v0, p0, Lasx;->ab:Lard;

    invoke-virtual {v0}, Lard;->notifyDataSetChanged()V

    goto :goto_1
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 392
    iget-object v0, p0, Lasx;->ae:Landroid/widget/CompoundButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lasx;->ae:Landroid/widget/CompoundButton;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-direct {p0, v0}, Lasx;->a(Z)V

    .line 393
    return-void

    .line 392
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 397
    iget-object v1, p0, Lasx;->af:Llw;

    invoke-virtual {v1, v0}, Llw;->a(Z)V

    .line 398
    iget-object v1, p0, Lasx;->ae:Landroid/widget/CompoundButton;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lasx;->ae:Landroid/widget/CompoundButton;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    invoke-direct {p0, v0}, Lasx;->a(Z)V

    .line 399
    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 257
    invoke-super {p0, p1}, Lam;->e(Landroid/os/Bundle;)V

    .line 258
    iget-object v0, p0, Lasx;->ae:Landroid/widget/CompoundButton;

    if-eqz v0, :cond_0

    .line 259
    const-string v0, "photoSettingsState"

    iget-object v1, p0, Lasx;->ae:Landroid/widget/CompoundButton;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 260
    const-string v0, "userRequestedRefresh"

    iget-object v1, p0, Lasx;->af:Llw;

    .line 6518
    iget-boolean v1, v1, Llw;->b:Z

    .line 260
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 261
    const-string v0, "sortOptionState"

    iget v1, p0, Lasx;->c:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 263
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lasx;->al:Z

    .line 264
    return-void
.end method

.method public final j()V
    .locals 1

    .prologue
    .line 249
    invoke-super {p0}, Lam;->j()V

    .line 250
    iget-object v0, p0, Lasx;->aa:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    invoke-virtual {v0, p0}, Lash;->a(Lasq;)V

    .line 251
    iget-object v0, p0, Lasx;->ab:Lard;

    .line 6266
    iput-object p0, v0, Lard;->d:Larg;

    .line 252
    iget-object v0, p0, Lasx;->ab:Lard;

    .line 6270
    iput-object p0, v0, Lard;->c:Larh;

    .line 253
    return-void
.end method

.method public final k()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 268
    invoke-super {p0}, Lam;->k()V

    .line 269
    iget-object v0, p0, Lasx;->aa:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    invoke-virtual {v0, p0}, Lash;->b(Lasq;)V

    .line 270
    iget-object v0, p0, Lasx;->ab:Lard;

    .line 7266
    iput-object v1, v0, Lard;->d:Larg;

    .line 271
    iget-object v0, p0, Lasx;->ab:Lard;

    .line 7270
    iput-object v1, v0, Lard;->c:Larh;

    .line 272
    return-void
.end method

.method public final l()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 276
    invoke-super {p0}, Lam;->l()V

    .line 280
    iget-object v0, p0, Lasx;->aa:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    invoke-virtual {v0}, Lash;->s()Lauq;

    move-result-object v0

    .line 281
    iget-boolean v1, p0, Lasx;->al:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lasx;->am:Ldcj;

    iget-object v1, v1, Ldcj;->j:Ljava/lang/String;

    .line 282
    invoke-virtual {v0, v1}, Lauq;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lasx;->ab:Lard;

    .line 7444
    iget-object v0, v0, Lard;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    .line 283
    if-nez v0, :cond_0

    .line 7612
    iget-object v0, p0, Lj;->y:Lm;

    .line 284
    invoke-virtual {v0}, Lm;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 285
    iget-object v0, p0, Lasx;->aa:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    invoke-virtual {v0}, Lash;->s()Lauq;

    move-result-object v0

    iget-object v1, p0, Lasx;->am:Ldcj;

    iget-object v1, v1, Ldcj;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lauq;->a(Ljava/lang/String;Z)V

    .line 286
    iget-object v0, p0, Lasx;->aa:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lash;->b(I)V

    .line 8612
    iget-object v0, p0, Lj;->y:Lm;

    .line 287
    invoke-virtual {v0}, Lm;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lb;->cK:I

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 288
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 290
    :cond_0
    iget-object v0, p0, Lasx;->aa:Laqw;

    invoke-interface {v0}, Laqw;->h()Lash;

    move-result-object v0

    iget-object v1, p0, Lasx;->ab:Lard;

    invoke-virtual {v0, v1}, Lash;->b(Lasq;)V

    .line 291
    iput-object v2, p0, Lasx;->af:Llw;

    .line 292
    iput-object v2, p0, Lasx;->ah:Landroid/widget/ViewFlipper;

    .line 293
    iput-object v2, p0, Lasx;->aj:Landroid/widget/TextView;

    .line 294
    iput-object v2, p0, Lasx;->ab:Lard;

    .line 295
    return-void
.end method

.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 330
    iget-object v1, p0, Lasx;->ae:Landroid/widget/CompoundButton;

    if-ne p1, v1, :cond_0

    .line 332
    invoke-direct {p0, p2}, Lasx;->b(Z)V

    .line 333
    invoke-direct {p0, p2}, Lasx;->a(Z)V

    .line 334
    iget-boolean v1, p0, Lasx;->an:Z

    if-eqz v1, :cond_1

    .line 335
    iput-boolean v0, p0, Lasx;->an:Z

    .line 343
    :cond_0
    :goto_0
    return-void

    .line 337
    :cond_1
    iget-object v1, p0, Lasx;->ag:Landroid/view/View;

    if-eqz p2, :cond_2

    const/16 v0, 0x8

    :cond_2
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 338
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    new-instance v1, Lapd;

    const/16 v2, 0x4c

    invoke-direct {v1, v2}, Lapd;-><init>(I)V

    iget-object v2, p0, Lasx;->am:Ldcj;

    iget-object v2, v2, Ldcj;->b:Ljava/lang/Integer;

    .line 340
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    .line 338
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    goto :goto_0
.end method

.method public final p()V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 347
    iget-object v0, p0, Lasx;->ab:Lard;

    .line 12444
    iget-object v0, v0, Lard;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    .line 347
    if-lez v0, :cond_1

    move v0, v1

    .line 348
    :goto_0
    iget-object v2, p0, Lasx;->ae:Landroid/widget/CompoundButton;

    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v2

    if-eq v2, v0, :cond_0

    .line 349
    iput-boolean v1, p0, Lasx;->an:Z

    .line 350
    iget-object v1, p0, Lasx;->ae:Landroid/widget/CompoundButton;

    invoke-virtual {v1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 351
    iget-object v1, p0, Lasx;->aa:Laqw;

    invoke-interface {v1}, Laqw;->h()Lash;

    move-result-object v1

    invoke-virtual {v1}, Lash;->s()Lauq;

    move-result-object v1

    iget-object v2, p0, Lasx;->am:Ldcj;

    iget-object v2, v2, Ldcj;->j:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lauq;->a(Ljava/lang/String;Z)V

    .line 354
    :cond_0
    return-void

    .line 347
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

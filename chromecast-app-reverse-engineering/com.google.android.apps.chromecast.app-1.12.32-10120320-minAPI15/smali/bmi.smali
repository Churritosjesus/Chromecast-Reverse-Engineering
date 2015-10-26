.class public final Lbmi;
.super Li;
.source "PG"


# instance fields
.field private Z:Landroid/view/View;

.field private aa:Lbos;

.field private ab:Landroid/app/AlertDialog;

.field private ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

.field private ad:Z

.field private ae:Lbfs;

.field private af:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Li;-><init>()V

    return-void
.end method

.method public static a(ZLbfs;)Lbmi;
    .locals 3

    .prologue
    .line 36
    new-instance v0, Lbmi;

    invoke-direct {v0}, Lbmi;-><init>()V

    .line 38
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 39
    const-string v2, "hasScannedNetworks"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 40
    const-string v2, "wifiNetwork"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 41
    invoke-virtual {v0, v1}, Lbmi;->f(Landroid/os/Bundle;)V

    .line 43
    return-object v0
.end method

.method static synthetic a(Lbmi;I)V
    .locals 1

    .prologue
    .line 20
    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lbmi;->b(I)V

    return-void
.end method

.method static synthetic a(Lbmi;Z)V
    .locals 1

    .prologue
    .line 20
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lbmi;->g(Z)V

    return-void
.end method

.method static synthetic a(Lbmi;)Z
    .locals 1

    .prologue
    .line 20
    iget-boolean v0, p0, Lbmi;->ad:Z

    return v0
.end method

.method static synthetic b(Lbmi;)Landroid/app/AlertDialog;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lbmi;->ab:Landroid/app/AlertDialog;

    return-object v0
.end method

.method private b(I)V
    .locals 2

    .prologue
    .line 171
    iget-object v0, p0, Lbmi;->ab:Landroid/app/AlertDialog;

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setVisibility(I)V

    .line 172
    iget-object v0, p0, Lbmi;->ab:Landroid/app/AlertDialog;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setVisibility(I)V

    .line 173
    return-void
.end method

.method static synthetic c(Lbmi;)Lbos;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lbmi;->aa:Lbos;

    return-object v0
.end method

.method static synthetic d(Lbmi;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lbmi;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    return-object v0
.end method

.method private g(Z)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 155
    iget-object v0, p0, Lbmi;->Z:Landroid/view/View;

    sget v1, Lf;->bH:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 156
    iget-object v1, p0, Lbmi;->Z:Landroid/view/View;

    sget v2, Lf;->ba:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 158
    if-eqz p1, :cond_0

    .line 159
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 160
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 165
    :goto_0
    return-void

    .line 162
    :cond_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 163
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 54
    invoke-super {p0}, Li;->a()V

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lbmi;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 56
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 48
    invoke-super {p0, p1}, Li;->a(Landroid/app/Activity;)V

    .line 49
    check-cast p1, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    iput-object p1, p0, Lbmi;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 50
    return-void
.end method

.method public final c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 67
    .line 1559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 67
    const-string v1, "hasScannedNetworks"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lbmi;->ad:Z

    .line 2559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 68
    const-string v1, "wifiNetwork"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lbfs;

    iput-object v0, p0, Lbmi;->ae:Lbfs;

    .line 69
    iget-object v0, p0, Lbmi;->ae:Lbfs;

    .line 3130
    iget-object v0, v0, Lbfs;->a:Ljava/lang/String;

    .line 69
    iput-object v0, p0, Lbmi;->af:Ljava/lang/String;

    .line 72
    if-eqz p1, :cond_1

    .line 73
    const-string v0, "hasScannedNetworks"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    const-string v0, "hasScannedNetworks"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lbmi;->ad:Z

    .line 76
    :cond_0
    const-string v0, "selectedNetwork"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 77
    const-string v0, "selectedNetwork"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbmi;->af:Ljava/lang/String;

    .line 3612
    :cond_1
    iget-object v0, p0, Lj;->y:Lm;

    .line 82
    invoke-virtual {v0}, Lm;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, La;->gj:I

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lbmi;->Z:Landroid/view/View;

    .line 84
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lbmi;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 85
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setInverseBackgroundForced(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->cX:I

    .line 86
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lbmi;->Z:Landroid/view/View;

    .line 87
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->H:I

    .line 88
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->I:I

    .line 89
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 90
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 91
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lbmi;->ab:Landroid/app/AlertDialog;

    .line 93
    iget-object v0, p0, Lbmi;->ab:Landroid/app/AlertDialog;

    new-instance v1, Lbmj;

    invoke-direct {v1, p0}, Lbmj;-><init>(Lbmi;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 117
    iget-object v0, p0, Lbmi;->ab:Landroid/app/AlertDialog;

    return-object v0
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 60
    invoke-super {p0, p1}, Li;->e(Landroid/os/Bundle;)V

    .line 61
    const-string v0, "hasScannedNetworks"

    iget-boolean v1, p0, Lbmi;->ad:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 62
    const-string v0, "selectedNetwork"

    iget-object v1, p0, Lbmi;->aa:Lbos;

    invoke-virtual {v1}, Lbos;->a()Lbfs;

    move-result-object v1

    .line 1130
    iget-object v1, v1, Lbfs;->a:Ljava/lang/String;

    .line 62
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    return-void
.end method

.method public final p()V
    .locals 7

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 121
    iget-object v0, p0, Lbmi;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    if-nez v0, :cond_0

    .line 137
    :goto_0
    return-void

    .line 126
    :cond_0
    iput-boolean v2, p0, Lbmi;->ad:Z

    .line 128
    new-instance v1, Lbos;

    iget-object v0, p0, Lbmi;->Z:Landroid/view/View;

    sget v4, Lf;->ba:I

    .line 129
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-direct {v1, v0}, Lbos;-><init>(Landroid/view/ViewGroup;)V

    iput-object v1, p0, Lbmi;->aa:Lbos;

    .line 4140
    iget-object v0, p0, Lbmi;->aa:Lbos;

    if-eqz v0, :cond_1

    .line 4141
    iget-object v0, p0, Lbmi;->ae:Lbfs;

    if-nez v0, :cond_2

    .line 4142
    sget-object v0, Lbfu;->a:Lbfu;

    .line 4144
    :goto_1
    iget-object v4, p0, Lbmi;->aa:Lbos;

    iget-object v1, p0, Lbmi;->ac:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 5643
    iget-object v5, v1, Land;->r:Ljava/util/ArrayList;

    .line 4144
    iget-object v6, p0, Lbmi;->af:Ljava/lang/String;

    iget-object v1, p0, Lbmi;->ae:Lbfs;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lbmi;->ae:Lbfs;

    .line 6178
    iget-boolean v1, v1, Lbfs;->g:Z

    .line 4145
    if-eqz v1, :cond_3

    move v1, v2

    .line 4144
    :goto_2
    invoke-virtual {v4, v5, v6, v0, v1}, Lbos;->a(Ljava/util/List;Ljava/lang/String;Lbfu;Z)V

    .line 133
    :cond_1
    iget-object v0, p0, Lbmi;->aa:Lbos;

    sget v1, Lb;->el:I

    invoke-virtual {p0, v1}, Lbmi;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbos;->a(Ljava/lang/String;)V

    .line 135
    invoke-direct {p0, v2}, Lbmi;->g(Z)V

    .line 136
    invoke-direct {p0, v3}, Lbmi;->b(I)V

    goto :goto_0

    .line 4142
    :cond_2
    iget-object v0, p0, Lbmi;->ae:Lbfs;

    .line 5138
    iget-object v0, v0, Lbfs;->b:Lbfu;

    goto :goto_1

    :cond_3
    move v1, v3

    .line 4145
    goto :goto_2
.end method

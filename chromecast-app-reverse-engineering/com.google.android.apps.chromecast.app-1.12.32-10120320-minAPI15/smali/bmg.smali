.class public final Lbmg;
.super Li;
.source "PG"


# instance fields
.field private Z:Landroid/widget/EditText;

.field private aa:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

.field private ab:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Li;-><init>()V

    return-void
.end method

.method static synthetic a(Lbmg;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lbmg;->Z:Landroid/widget/EditText;

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lbmg;
    .locals 3

    .prologue
    .line 29
    new-instance v0, Lbmg;

    invoke-direct {v0}, Lbmg;-><init>()V

    .line 31
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 32
    const-string v2, "oldName"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    invoke-virtual {v0, v1}, Lbmg;->f(Landroid/os/Bundle;)V

    .line 35
    return-object v0
.end method

.method static synthetic b(Lbmg;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lbmg;->ab:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lbmg;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lbmg;->aa:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 46
    invoke-super {p0}, Li;->a()V

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lbmg;->aa:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 48
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 40
    invoke-super {p0, p1}, Li;->a(Landroid/app/Activity;)V

    .line 41
    check-cast p1, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    iput-object p1, p0, Lbmg;->aa:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 42
    return-void
.end method

.method public final c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v3, 0x1

    .line 52
    .line 1559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 52
    const-string v1, "oldName"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbmg;->ab:Ljava/lang/String;

    .line 1612
    iget-object v0, p0, Lj;->y:Lm;

    .line 55
    invoke-virtual {v0}, Lm;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, La;->fZ:I

    invoke-virtual {v0, v1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 56
    sget v0, Lf;->bl:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lbmg;->Z:Landroid/widget/EditText;

    .line 57
    iget-object v0, p0, Lbmg;->Z:Landroid/widget/EditText;

    iget-object v2, p0, Lbmg;->ab:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 58
    iget-object v0, p0, Lbmg;->Z:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->selectAll()V

    .line 60
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lbmg;->aa:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 61
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setInverseBackgroundForced(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v2, Lb;->cW:I

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lbmg;->ab:Ljava/lang/String;

    aput-object v5, v3, v4

    .line 62
    invoke-virtual {p0, v2, v3}, Lbmg;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 63
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->H:I

    .line 64
    invoke-virtual {v0, v1, v6}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->I:I

    new-instance v2, Lbmh;

    invoke-direct {v2, p0}, Lbmh;-><init>(Lbmg;)V

    .line 65
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 75
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 76
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 79
    return-object v0
.end method

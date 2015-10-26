.class public final Lbol;
.super Li;
.source "PG"


# instance fields
.field private Z:Lapd;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Li;-><init>()V

    return-void
.end method

.method static synthetic a(Lbol;Z)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 25
    .line 6096
    iget-object v0, p0, Lbol;->Z:Lapd;

    if-eqz v0, :cond_0

    .line 6097
    invoke-static {}, Lape;->a()Lape;

    move-result-object v2

    iget-object v3, p0, Lbol;->Z:Lapd;

    if-eqz p1, :cond_2

    move v0, v1

    .line 6098
    :goto_0
    invoke-virtual {v3, v0}, Lapd;->a(I)Lapd;

    move-result-object v0

    .line 6097
    invoke-virtual {v2, v0}, Lape;->a(Lapd;)V

    .line 6099
    const/4 v0, 0x0

    iput-object v0, p0, Lbol;->Z:Lapd;

    .line 6101
    :cond_0
    if-eqz p1, :cond_3

    .line 6102
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 6469
    iput-boolean v1, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->b:Z

    .line 6470
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "TERMS_ACCEPTED"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 6612
    iget-object v0, p0, Lj;->y:Lm;

    .line 6103
    instance-of v0, v0, Lboo;

    if-eqz v0, :cond_1

    .line 7612
    iget-object v0, p0, Lj;->y:Lm;

    .line 6104
    check-cast v0, Lboo;

    invoke-interface {v0}, Lboo;->e()V

    :cond_1
    :goto_1
    return-void

    .line 6098
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 8612
    :cond_3
    iget-object v0, p0, Lj;->y:Lm;

    .line 6108
    invoke-virtual {v0}, Lm;->finish()V

    goto :goto_1
.end method

.method public static a(Lmm;)V
    .locals 3

    .prologue
    .line 36
    .line 1808
    iget-object v0, p0, Lm;->b:Lt;

    .line 37
    const-string v1, "termsDialog"

    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v1

    .line 38
    if-eqz v1, :cond_0

    .line 42
    :goto_0
    return-void

    .line 2045
    :cond_0
    new-instance v1, Lbol;

    invoke-direct {v1}, Lbol;-><init>()V

    .line 2046
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lbol;->b(Z)V

    .line 41
    const-string v2, "termsDialog"

    invoke-virtual {v1, v0, v2}, Lbol;->a(Lr;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public final c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 55
    new-instance v0, Lapd;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lapd;-><init>(I)V

    iput-object v0, p0, Lbol;->Z:Lapd;

    .line 57
    invoke-static {}, Lblj;->d()Z

    move-result v1

    .line 60
    sget v0, Lb;->dJ:I

    invoke-virtual {p0, v0}, Lbol;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 61
    if-eqz v1, :cond_0

    sget v0, Lb;->cR:I

    :goto_0
    invoke-virtual {p0, v0}, Lbol;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 65
    if-eqz v1, :cond_1

    sget v0, Lb;->dM:I

    :goto_1
    new-array v1, v8, [Ljava/lang/Object;

    aput-object v2, v1, v6

    aput-object v3, v1, v7

    invoke-virtual {p0, v0, v1}, Lbol;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 2612
    iget-object v1, p0, Lj;->y:Lm;

    .line 69
    sget v4, La;->gQ:I

    const/4 v5, 0x4

    new-array v5, v5, [Ljava/lang/String;

    aput-object v2, v5, v6

    .line 3612
    iget-object v2, p0, Lj;->y:Lm;

    .line 70
    invoke-static {v2}, Lblx;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v5, v7

    aput-object v3, v5, v8

    const/4 v2, 0x3

    .line 4612
    iget-object v3, p0, Lj;->y:Lm;

    .line 71
    invoke-static {v3}, Lblx;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v5, v2

    .line 69
    invoke-static {v1, v4, v0, v5}, Lblx;->a(Landroid/content/Context;ILjava/lang/String;[Ljava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 72
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 5612
    iget-object v2, p0, Lj;->y:Lm;

    .line 72
    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v2, Lb;->dN:I

    .line 73
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 74
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->dH:I

    new-instance v2, Lbon;

    invoke-direct {v2, p0}, Lbon;-><init>(Lbol;)V

    .line 75
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->dI:I

    .line 82
    invoke-virtual {p0, v1}, Lbol;->a(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lbom;

    invoke-direct {v2, p0}, Lbom;-><init>(Lbol;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 89
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0

    .line 62
    :cond_0
    sget v0, Lb;->cQ:I

    goto :goto_0

    .line 65
    :cond_1
    sget v0, Lb;->dL:I

    goto :goto_1
.end method

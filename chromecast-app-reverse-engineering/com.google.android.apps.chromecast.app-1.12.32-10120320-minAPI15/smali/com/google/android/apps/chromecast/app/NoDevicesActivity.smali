.class public Lcom/google/android/apps/chromecast/app/NoDevicesActivity;
.super Lmm;
.source "PG"


# static fields
.field private static e:Ljava/lang/String; = "chromecast"

.field private static f:Ljava/lang/String; = "chromecastAudio"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lmm;-><init>()V

    return-void
.end method

.method public static final a(Landroid/content/Context;Z)Landroid/content/Intent;
    .locals 3

    .prologue
    .line 44
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/google/android/apps/chromecast/app/NoDevicesActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "fragmentType"

    if-eqz p1, :cond_0

    .line 45
    sget-object v0, Lcom/google/android/apps/chromecast/app/NoDevicesActivity;->f:Ljava/lang/String;

    .line 44
    :goto_0
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    return-object v0

    .line 45
    :cond_0
    sget-object v0, Lcom/google/android/apps/chromecast/app/NoDevicesActivity;->e:Ljava/lang/String;

    goto :goto_0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 25
    invoke-super {p0, p1}, Lmm;->onCreate(Landroid/os/Bundle;)V

    .line 26
    sget v0, La;->gm:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/NoDevicesActivity;->setContentView(I)V

    .line 27
    invoke-static {p0}, Lblx;->g(Landroid/app/Activity;)V

    .line 29
    sget v0, Lf;->cs:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/NoDevicesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/NoDevicesActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    .line 1077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 30
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lmj;->b(Z)V

    .line 2077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 31
    sget v1, Lb;->bW:I

    invoke-virtual {v0, v1}, Lmj;->a(I)V

    .line 34
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/NoDevicesActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "fragmentType"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "chromecast"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 35
    new-instance v0, Lamm;

    invoke-direct {v0}, Lamm;-><init>()V

    .line 2808
    :goto_0
    iget-object v1, p0, Lm;->b:Lt;

    .line 39
    invoke-virtual {v1}, Lr;->a()Laf;

    move-result-object v1

    sget v2, Lf;->cm:I

    invoke-virtual {v1, v2, v0}, Laf;->a(ILj;)Laf;

    move-result-object v0

    .line 40
    invoke-virtual {v0}, Laf;->b()I

    .line 41
    return-void

    .line 37
    :cond_0
    new-instance v0, Laml;

    invoke-direct {v0}, Laml;-><init>()V

    goto :goto_0
.end method

.method public onGetHelpClicked(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 49
    .line 50
    invoke-static {p0}, Lblf;->Q(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 49
    invoke-static {p0, v0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 51
    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/NoDevicesActivity;->startActivity(Landroid/content/Intent;)V

    .line 52
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/NoDevicesActivity;->finish()V

    .line 58
    const/4 v0, 0x1

    return v0
.end method

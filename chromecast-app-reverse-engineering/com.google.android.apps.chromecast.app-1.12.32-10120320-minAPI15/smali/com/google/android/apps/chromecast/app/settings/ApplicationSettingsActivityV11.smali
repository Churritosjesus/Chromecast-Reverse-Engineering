.class public Lcom/google/android/apps/chromecast/app/settings/ApplicationSettingsActivityV11;
.super Lmm;
.source "PG"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Lmm;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 20
    invoke-super {p0, p1}, Lmm;->onCreate(Landroid/os/Bundle;)V

    .line 22
    invoke-static {p0}, Lblx;->g(Landroid/app/Activity;)V

    .line 23
    sget v0, La;->fs:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/settings/ApplicationSettingsActivityV11;->setContentView(I)V

    .line 24
    sget v0, Lf;->eo:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/settings/ApplicationSettingsActivityV11;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/settings/ApplicationSettingsActivityV11;->a(Landroid/support/v7/widget/Toolbar;)V

    .line 1077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 25
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lmj;->b(Z)V

    .line 28
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/settings/ApplicationSettingsActivityV11;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    sget v1, Lf;->bk:I

    new-instance v2, Lbgm;

    invoke-direct {v2}, Lbgm;-><init>()V

    .line 29
    invoke-virtual {v0, v1, v2}, Landroid/app/FragmentTransaction;->replace(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 30
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 45
    invoke-static {p1}, Lblx;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 46
    const/4 v0, 0x1

    .line 48
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lmm;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 53
    invoke-static {p1, p0}, Lblx;->a(ILm;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    const/4 v0, 0x1

    .line 56
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lmm;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 34
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 39
    invoke-super {p0, p1}, Lmm;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    :goto_0
    return v0

    .line 36
    :pswitch_0
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/settings/ApplicationSettingsActivityV11;->finish()V

    .line 37
    const/4 v0, 0x1

    goto :goto_0

    .line 34
    nop

    :pswitch_data_0
    .packed-switch 0x102002c
        :pswitch_0
    .end packed-switch
.end method

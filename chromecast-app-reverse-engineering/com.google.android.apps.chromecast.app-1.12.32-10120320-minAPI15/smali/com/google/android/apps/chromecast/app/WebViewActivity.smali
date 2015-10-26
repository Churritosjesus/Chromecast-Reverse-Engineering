.class public Lcom/google/android/apps/chromecast/app/WebViewActivity;
.super Lmm;
.source "PG"

# interfaces
.implements Lapc;
.implements Lbaq;


# instance fields
.field private e:Lbah;

.field private f:Lapa;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lmm;-><init>()V

    return-void
.end method


# virtual methods
.method public final b_()Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 136
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c_()V
    .locals 1

    .prologue
    .line 141
    .line 7077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 141
    invoke-virtual {v0}, Lmj;->d()V

    .line 142
    return-void
.end method

.method public final e()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 131
    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()V
    .locals 1

    .prologue
    .line 146
    .line 8077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 146
    invoke-virtual {v0}, Lmj;->c()V

    .line 147
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/WebViewActivity;->e:Lbah;

    invoke-virtual {v0}, Lbah;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/WebViewActivity;->e:Lbah;

    invoke-virtual {v0}, Lbah;->d()V

    .line 111
    :goto_0
    return-void

    .line 104
    :cond_0
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/WebViewActivity;->f:Lapa;

    invoke-virtual {v0}, Lapa;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 105
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/WebViewActivity;->f:Lapa;

    invoke-virtual {v0}, Lapa;->q()V

    goto :goto_0

    .line 109
    :cond_1
    invoke-super {p0}, Lmm;->onBackPressed()V

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 77
    invoke-super {p0, p1}, Lmm;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 78
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/WebViewActivity;->e:Lbah;

    invoke-virtual {v0, p1}, Lbah;->a(Landroid/content/res/Configuration;)V

    .line 79
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 37
    invoke-super {p0, p1}, Lmm;->onCreate(Landroid/os/Bundle;)V

    .line 38
    sget v0, La;->gU:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/WebViewActivity;->setContentView(I)V

    .line 39
    sget v0, Lf;->eo:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/WebViewActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    .line 41
    new-instance v0, Lbah;

    sget-object v1, Lbat;->c:Lbat;

    invoke-direct {v0, p0, p0, v1}, Lbah;-><init>(Lmm;Lbaq;Lbat;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/WebViewActivity;->e:Lbah;

    .line 43
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/WebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "topLevelActivity"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    sget v0, Lf;->aW:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/widget/DrawerLayout;

    .line 46
    invoke-virtual {v0, v3}, Landroid/support/v4/widget/DrawerLayout;->a(I)V

    .line 1077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 47
    invoke-virtual {v0, v3}, Lmj;->b(Z)V

    .line 48
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/WebViewActivity;->e:Lbah;

    .line 1459
    iget-object v0, v0, Lbah;->c:Lmn;

    .line 2356
    iget-boolean v1, v0, Lmn;->d:Z

    if-eq v2, v1, :cond_0

    .line 2362
    iget-object v1, v0, Lmn;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1, v2}, Lmn;->a(Landroid/graphics/drawable/Drawable;I)V

    .line 2364
    iput-boolean v2, v0, Lmn;->d:Z

    .line 3077
    :cond_0
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 50
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/WebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "title"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmj;->a(Ljava/lang/CharSequence;)V

    .line 52
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/WebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "url"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lapa;->a(Ljava/lang/String;)Lapa;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/WebViewActivity;->f:Lapa;

    .line 3808
    iget-object v0, p0, Lm;->b:Lt;

    .line 53
    invoke-virtual {v0}, Lr;->a()Laf;

    move-result-object v0

    sget v1, Lf;->ey:I

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/WebViewActivity;->f:Lapa;

    .line 54
    invoke-virtual {v0, v1, v2}, Laf;->a(ILj;)Laf;

    move-result-object v0

    invoke-virtual {v0}, Laf;->b()I

    .line 55
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 95
    invoke-super {p0}, Lmm;->onDestroy()V

    .line 96
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/WebViewActivity;->e:Lbah;

    invoke-virtual {v0}, Lbah;->c()V

    .line 97
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 115
    invoke-static {p1}, Lblx;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    const/4 v0, 0x1

    .line 118
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
    .line 123
    invoke-static {p1, p0}, Lblx;->a(ILm;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    const/4 v0, 0x1

    .line 126
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lmm;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 59
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/WebViewActivity;->e:Lbah;

    invoke-virtual {v1, p1}, Lbah;->a(Landroid/view/MenuItem;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 66
    :goto_0
    return v0

    .line 61
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    const v2, 0x102002c

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/WebViewActivity;->e:Lbah;

    .line 4466
    iget-object v1, v1, Lbah;->c:Lmn;

    .line 5342
    iget-boolean v1, v1, Lmn;->d:Z

    .line 62
    if-nez v1, :cond_1

    .line 63
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/WebViewActivity;->finish()V

    goto :goto_0

    .line 66
    :cond_1
    invoke-super {p0, p1}, Lmm;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onPostCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 71
    invoke-super {p0, p1}, Lmm;->onPostCreate(Landroid/os/Bundle;)V

    .line 72
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/WebViewActivity;->e:Lbah;

    .line 6290
    iget-object v0, v0, Lbah;->c:Lmn;

    invoke-virtual {v0}, Lmn;->c()V

    .line 73
    return-void
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 83
    invoke-super {p0}, Lmm;->onStart()V

    .line 84
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/WebViewActivity;->e:Lbah;

    invoke-virtual {v0}, Lbah;->a()V

    .line 85
    return-void
.end method

.method protected onStop()V
    .locals 1

    .prologue
    .line 89
    invoke-super {p0}, Lmm;->onStop()V

    .line 90
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/WebViewActivity;->e:Lbah;

    invoke-virtual {v0}, Lbah;->b()V

    .line 91
    return-void
.end method

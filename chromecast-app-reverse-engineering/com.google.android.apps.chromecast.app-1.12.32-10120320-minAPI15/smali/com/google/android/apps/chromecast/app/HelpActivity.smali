.class public Lcom/google/android/apps/chromecast/app/HelpActivity;
.super Lmm;
.source "PG"

# interfaces
.implements Lapc;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lmm;-><init>()V

    .line 218
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    .prologue
    .line 49
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/google/android/apps/chromecast/app/HelpActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 50
    const-string v1, "url"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 51
    return-object v0
.end method


# virtual methods
.method public final c_()V
    .locals 2

    .prologue
    .line 204
    .line 7077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 204
    invoke-virtual {v0}, Lmj;->d()V

    .line 205
    sget v0, Lf;->bh:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 206
    return-void
.end method

.method public final f()V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 210
    .line 8077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v1

    invoke-virtual {v1}, Lnh;->a()Lmj;

    move-result-object v1

    .line 210
    invoke-virtual {v1}, Lmj;->c()V

    .line 211
    sget v1, Lf;->bh:I

    invoke-virtual {p0, v1}, Lcom/google/android/apps/chromecast/app/HelpActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 212
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "feedbackSupported"

    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 211
    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 213
    return-void

    .line 212
    :cond_0
    const/16 v0, 0x8

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 133
    .line 6808
    iget-object v0, p0, Lm;->b:Lt;

    .line 134
    const-string v1, "webViewFragment"

    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    check-cast v0, Lapa;

    .line 135
    if-eqz v0, :cond_0

    .line 136
    invoke-virtual {v0}, Lapa;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 137
    invoke-virtual {v0}, Lapa;->q()V

    .line 142
    :goto_0
    return-void

    .line 141
    :cond_0
    invoke-super {p0}, Lmm;->onBackPressed()V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v2, 0x0

    .line 56
    invoke-super {p0, p1}, Lmm;->onCreate(Landroid/os/Bundle;)V

    .line 58
    sget v0, La;->ga:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->setContentView(I)V

    .line 59
    invoke-static {p0}, Lblx;->g(Landroid/app/Activity;)V

    .line 61
    sget v0, Lf;->eo:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    .line 1077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 62
    invoke-virtual {v0, v5}, Lmj;->b(Z)V

    .line 2077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 63
    sget v1, Lb;->bK:I

    invoke-virtual {v0, v1}, Lmj;->a(I)V

    .line 3077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 64
    sget v1, Lb;->N:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Lb;->M:I

    .line 65
    invoke-virtual {p0, v4}, Lcom/google/android/apps/chromecast/app/HelpActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v2

    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/apps/chromecast/app/SetupApplication;->e()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    .line 64
    invoke-virtual {p0, v1, v3}, Lcom/google/android/apps/chromecast/app/HelpActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmj;->b(Ljava/lang/CharSequence;)V

    .line 67
    if-nez p1, :cond_0

    .line 70
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "url"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 71
    if-eqz v0, :cond_1

    .line 72
    invoke-static {v0}, Lapa;->a(Ljava/lang/String;)Lapa;

    move-result-object v1

    .line 73
    const-string v0, "webViewFragment"

    .line 3808
    :goto_0
    iget-object v3, p0, Lm;->b:Lt;

    .line 79
    invoke-virtual {v3}, Lr;->a()Laf;

    move-result-object v3

    sget v4, Lf;->br:I

    .line 80
    invoke-virtual {v3, v4, v1, v0}, Laf;->b(ILj;Ljava/lang/String;)Laf;

    move-result-object v0

    invoke-virtual {v0}, Laf;->b()I

    .line 83
    :cond_0
    sget v0, Lf;->bh:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 84
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v3, "feedbackSupported"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v2

    :goto_1
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 86
    return-void

    .line 75
    :cond_1
    new-instance v1, Lamn;

    invoke-direct {v1}, Lamn;-><init>()V

    .line 76
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v1, v0}, Lj;->f(Landroid/os/Bundle;)V

    .line 77
    const-string v0, "textViewFragment"

    goto :goto_0

    .line 85
    :cond_2
    const/16 v0, 0x8

    goto :goto_1
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 101
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    .line 102
    sget v1, La;->ha:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 103
    invoke-super {p0, p1}, Lmm;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 146
    invoke-static {p1}, Lblx;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    const/4 v0, 0x1

    .line 149
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
    .line 154
    invoke-static {p1, p0}, Lblx;->a(ILm;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    const/4 v0, 0x1

    .line 157
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lmm;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 108
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    .line 109
    const v2, 0x102002c

    if-ne v1, v2, :cond_1

    .line 110
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->finish()V

    .line 5194
    :cond_0
    :goto_0
    return v0

    .line 112
    :cond_1
    sget v2, Lf;->bO:I

    if-ne v1, v2, :cond_2

    .line 5161
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 5162
    sget v2, Lb;->ay:I

    invoke-virtual {p0, v2}, Lcom/google/android/apps/chromecast/app/HelpActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 5163
    invoke-virtual {p0, v1}, Lcom/google/android/apps/chromecast/app/HelpActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 115
    :cond_2
    sget v2, Lf;->bX:I

    if-ne v1, v2, :cond_3

    .line 5167
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/google/android/apps/chromecast/app/WebViewActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 5168
    const-string v2, "url"

    invoke-static {p0}, Lblx;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5169
    const-string v2, "topLevelActivity"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 5170
    const-string v2, "title"

    sget v3, Lb;->cO:I

    .line 5171
    invoke-virtual {p0, v3}, Lcom/google/android/apps/chromecast/app/HelpActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 5170
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5172
    invoke-virtual {p0, v1}, Lcom/google/android/apps/chromecast/app/HelpActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 118
    :cond_3
    sget v2, Lf;->bQ:I

    if-ne v1, v2, :cond_4

    .line 5176
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/google/android/apps/chromecast/app/WebViewActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 5177
    const-string v2, "url"

    sget v3, Lb;->cS:I

    invoke-virtual {p0, v3}, Lcom/google/android/apps/chromecast/app/HelpActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5178
    const-string v2, "topLevelActivity"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 5179
    const-string v2, "title"

    sget v3, Lb;->cN:I

    .line 5180
    invoke-virtual {p0, v3}, Lcom/google/android/apps/chromecast/app/HelpActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 5179
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5181
    invoke-virtual {p0, v1}, Lcom/google/android/apps/chromecast/app/HelpActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 121
    :cond_4
    sget v2, Lf;->bL:I

    if-ne v1, v2, :cond_5

    .line 5185
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/google/android/apps/chromecast/app/settings/OpenSourceLicenseActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 5186
    invoke-virtual {p0, v1}, Lcom/google/android/apps/chromecast/app/HelpActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 124
    :cond_5
    sget v2, Lf;->bP:I

    if-ne v1, v2, :cond_6

    .line 5808
    iget-object v1, p0, Lm;->b:Lt;

    .line 5194
    const-string v2, "textViewFragment"

    invoke-virtual {v1, v2}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    .line 125
    goto/16 :goto_0

    .line 127
    :cond_6
    invoke-super {p0, p1}, Lmm;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    goto/16 :goto_0
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 91
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 4808
    iget-object v0, p0, Lm;->b:Lt;

    .line 92
    const-string v1, "webViewFragment"

    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    if-nez v0, :cond_1

    .line 93
    :cond_0
    sget v0, Lf;->bP:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 94
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 96
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public sendFeedback(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 198
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "feedbackDevices"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 199
    invoke-static {p0, v0}, Lbkq;->a(Landroid/app/Activity;Ljava/util/List;)V

    .line 200
    return-void
.end method

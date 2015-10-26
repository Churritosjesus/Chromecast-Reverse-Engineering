.class public Lnf;
.super Lm;
.source "PG"

# interfaces
.implements Lba;
.implements Lmp;
.implements Lng;


# instance fields
.field private e:Lnh;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Lm;-><init>()V

    return-void
.end method

.method private e()Z
    .locals 8

    .prologue
    const/4 v4, 0x0

    const/16 v7, 0x10

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 332
    .line 1369
    invoke-static {p0}, Lat;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    .line 334
    if-eqz v0, :cond_8

    .line 1386
    invoke-static {p0, v0}, Lat;->a(Landroid/app/Activity;Landroid/content/Intent;)Z

    move-result v3

    .line 335
    if-eqz v3, :cond_7

    .line 336
    invoke-static {p0}, Laz;->a(Landroid/content/Context;)Laz;

    move-result-object v5

    .line 3198
    instance-of v0, p0, Lba;

    if-eqz v0, :cond_a

    move-object v0, p0

    .line 3199
    check-cast v0, Lba;

    invoke-interface {v0}, Lba;->b()Landroid/content/Intent;

    move-result-object v0

    .line 3201
    :goto_0
    if-nez v0, :cond_9

    .line 3202
    invoke-static {p0}, Lat;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    move-object v3, v0

    .line 3205
    :goto_1
    if-eqz v3, :cond_1

    .line 3208
    invoke-virtual {v3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    .line 3209
    if-nez v0, :cond_0

    .line 3210
    iget-object v0, v5, Laz;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v0

    .line 3212
    :cond_0
    invoke-virtual {v5, v0}, Laz;->a(Landroid/content/ComponentName;)Laz;

    .line 4161
    iget-object v0, v5, Laz;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4316
    :cond_1
    iget-object v0, v5, Laz;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4317
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No intents added to TaskStackBuilder; cannot startActivities"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4321
    :cond_2
    iget-object v0, v5, Laz;->a:Ljava/util/ArrayList;

    iget-object v3, v5, Laz;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v3, v3, [Landroid/content/Intent;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/Intent;

    .line 4322
    new-instance v3, Landroid/content/Intent;

    aget-object v6, v0, v2

    invoke-direct {v3, v6}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    const v6, 0x1000c000

    invoke-virtual {v3, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v3

    aput-object v3, v0, v2

    .line 4325
    iget-object v3, v5, Laz;->b:Landroid/content/Context;

    .line 5103
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5104
    if-lt v6, v7, :cond_5

    .line 6026
    invoke-virtual {v3, v0, v4}, Landroid/content/Context;->startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V

    move v2, v1

    .line 4325
    :cond_3
    :goto_2
    if-nez v2, :cond_4

    .line 4326
    new-instance v2, Landroid/content/Intent;

    array-length v3, v0

    add-int/lit8 v3, v3, -0x1

    aget-object v0, v0, v3

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 4327
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 4328
    iget-object v0, v5, Laz;->b:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 6141
    :cond_4
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v7, :cond_6

    .line 7034
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_3
    move v0, v1

    .line 355
    :goto_4
    return v0

    .line 5107
    :cond_5
    const/16 v4, 0xb

    if-lt v6, v4, :cond_3

    .line 6030
    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivities([Landroid/content/Intent;)V

    move v2, v1

    .line 5109
    goto :goto_2

    .line 6144
    :cond_6
    :try_start_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    .line 346
    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lnf;->finish()V

    goto :goto_3

    .line 7402
    :cond_7
    invoke-static {p0, v0}, Lat;->b(Landroid/app/Activity;Landroid/content/Intent;)V

    goto :goto_3

    :cond_8
    move v0, v2

    .line 355
    goto :goto_4

    :cond_9
    move-object v3, v0

    goto/16 :goto_1

    :cond_a
    move-object v0, v4

    goto/16 :goto_0
.end method


# virtual methods
.method public final a(Landroid/support/v7/widget/Toolbar;)V
    .locals 1

    .prologue
    .line 96
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnh;->a(Landroid/support/v7/widget/Toolbar;)V

    .line 97
    return-void
.end method

.method public final a_()V
    .locals 1

    .prologue
    .line 188
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->f()V

    .line 189
    return-void
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .prologue
    .line 121
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lnh;->b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 122
    return-void
.end method

.method public final b()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 369
    invoke-static {p0}, Lat;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lmo;
    .locals 1

    .prologue
    .line 421
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->h()Lmo;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lnh;
    .locals 1

    .prologue
    .line 428
    iget-object v0, p0, Lnf;->e:Lnh;

    if-nez v0, :cond_0

    .line 8077
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {p0, v0, p0}, Lnh;->a(Landroid/content/Context;Landroid/view/Window;Lng;)Lnh;

    move-result-object v0

    .line 429
    iput-object v0, p0, Lnf;->e:Lnh;

    .line 431
    :cond_0
    iget-object v0, p0, Lnf;->e:Lnh;

    return-object v0
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    .prologue
    .line 101
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->b()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    .prologue
    .line 195
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->f()V

    .line 196
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 126
    invoke-super {p0, p1}, Lm;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 127
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnh;->a(Landroid/content/res/Configuration;)V

    .line 128
    return-void
.end method

.method public onContentChanged()V
    .locals 0

    .prologue
    .line 409
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->i()V

    .line 58
    invoke-super {p0, p1}, Lm;->onCreate(Landroid/os/Bundle;)V

    .line 59
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnh;->a(Landroid/os/Bundle;)V

    .line 60
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 158
    invoke-super {p0}, Lm;->onDestroy()V

    .line 159
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->g()V

    .line 160
    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 3

    .prologue
    .line 144
    invoke-super {p0, p1, p2}, Lm;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 145
    const/4 v0, 0x1

    .line 153
    :goto_0
    return v0

    .line 1077
    :cond_0
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 149
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    const v2, 0x102002c

    if-ne v1, v2, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lmj;->b()I

    move-result v0

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_1

    .line 151
    invoke-direct {p0}, Lnf;->e()Z

    move-result v0

    goto :goto_0

    .line 153
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onPostCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 64
    invoke-super {p0, p1}, Lm;->onPostCreate(Landroid/os/Bundle;)V

    .line 65
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->c()V

    .line 66
    return-void
.end method

.method public onPostResume()V
    .locals 1

    .prologue
    .line 138
    invoke-super {p0}, Lm;->onPostResume()V

    .line 139
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->e()V

    .line 140
    return-void
.end method

.method public onStop()V
    .locals 1

    .prologue
    .line 132
    invoke-super {p0}, Lm;->onStop()V

    .line 133
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->d()V

    .line 134
    return-void
.end method

.method protected onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 1

    .prologue
    .line 164
    invoke-super {p0, p1, p2}, Lm;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 165
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnh;->a(Ljava/lang/CharSequence;)V

    .line 166
    return-void
.end method

.method public setContentView(I)V
    .locals 1

    .prologue
    .line 106
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnh;->a(I)V

    .line 107
    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 111
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnh;->a(Landroid/view/View;)V

    .line 112
    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .prologue
    .line 116
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lnh;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 117
    return-void
.end method

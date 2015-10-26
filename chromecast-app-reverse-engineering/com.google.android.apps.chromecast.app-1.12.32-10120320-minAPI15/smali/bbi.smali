.class public final Lbbi;
.super Li;
.source "PG"


# instance fields
.field private Z:Landroid/widget/CheckBox;

.field private aa:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 526
    invoke-direct {p0}, Li;-><init>()V

    .line 533
    const/4 v0, 0x1

    iput-boolean v0, p0, Lbbi;->aa:Z

    return-void
.end method


# virtual methods
.method public final c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 537
    .line 1612
    iget-object v0, p0, Lj;->y:Lm;

    .line 538
    invoke-virtual {v0}, Lm;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, La;->fG:I

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 539
    sget v0, Lf;->X:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lbbi;->Z:Landroid/widget/CheckBox;

    .line 540
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 2612
    iget-object v2, p0, Lj;->y:Lm;

    .line 540
    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 541
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->I:I

    .line 542
    invoke-virtual {v0, v1, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 543
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 548
    invoke-super {p0, p1}, Li;->e(Landroid/os/Bundle;)V

    .line 549
    const/4 v0, 0x0

    iput-boolean v0, p0, Lbbi;->aa:Z

    .line 550
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .prologue
    .line 554
    invoke-super {p0, p1}, Li;->onDismiss(Landroid/content/DialogInterface;)V

    .line 556
    iget-boolean v0, p0, Lbbi;->aa:Z

    if-eqz v0, :cond_1

    .line 557
    iget-object v0, p0, Lbbi;->Z:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3612
    iget-object v0, p0, Lj;->y:Lm;

    .line 559
    invoke-virtual {v0}, Lm;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 558
    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 559
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "CAST_SCREEN_DO_NOT_SHOW_WARNING"

    const/4 v2, 0x1

    .line 560
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 562
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lbbi;->Z:Landroid/widget/CheckBox;

    .line 4612
    iget-object v0, p0, Lj;->y:Lm;

    .line 563
    check-cast v0, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->h(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V

    .line 565
    :cond_1
    return-void
.end method

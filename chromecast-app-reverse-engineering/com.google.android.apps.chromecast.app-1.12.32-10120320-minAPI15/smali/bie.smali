.class final Lbie;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lbhf;


# direct methods
.method constructor <init>(Lbhf;)V
    .locals 0

    .prologue
    .line 421
    iput-object p1, p0, Lbie;->a:Lbhf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 425
    iget-object v0, p0, Lbie;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    .line 1352
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 1663
    iget-boolean v0, v0, Lash;->b:Z

    .line 425
    if-eqz v0, :cond_0

    .line 426
    iget-object v0, p0, Lbie;->a:Lbhf;

    .line 2612
    iget-object v0, v0, Lj;->y:Lm;

    .line 426
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lblx;->a(Landroid/app/Activity;Landroid/content/DialogInterface$OnClickListener;)V

    .line 436
    :goto_0
    return-void

    .line 427
    :cond_0
    iget-object v0, p0, Lbie;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-static {}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbie;->a:Lbhf;

    .line 428
    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    .line 3352
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 428
    invoke-virtual {v0}, Lash;->r()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 430
    iget-object v0, p0, Lbie;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    iget-object v1, p0, Lbie;->a:Lbhf;

    .line 431
    invoke-static {v1}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v1

    .line 4352
    iget-object v1, v1, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 431
    invoke-virtual {v1}, Lash;->t()Laur;

    move-result-object v1

    .line 5037
    iget-object v1, v1, Laur;->b:Ldcj;

    .line 431
    const-string v2, "backdropSettingsFragment"

    .line 430
    invoke-virtual {v0, v1, v2}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->b(Ldcj;Ljava/lang/String;)V

    goto :goto_0

    .line 434
    :cond_1
    iget-object v0, p0, Lbie;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->m()V

    goto :goto_0
.end method

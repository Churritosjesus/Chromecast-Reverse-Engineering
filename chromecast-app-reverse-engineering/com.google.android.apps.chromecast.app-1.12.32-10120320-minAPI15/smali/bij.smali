.class final Lbij;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laop;


# instance fields
.field final synthetic a:Lbii;


# direct methods
.method constructor <init>(Lbii;)V
    .locals 0

    .prologue
    .line 562
    iput-object p1, p0, Lbij;->a:Lbii;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 565
    iget-object v0, p0, Lbij;->a:Lbii;

    iget-object v0, v0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    new-instance v1, Lbik;

    invoke-direct {v1, p0}, Lbik;-><init>(Lbij;)V

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Laop;)V

    .line 584
    return-void
.end method

.method public final b()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 588
    iget-object v0, p0, Lbij;->a:Lbii;

    iget-object v0, v0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    if-nez v0, :cond_1

    .line 600
    :cond_0
    :goto_0
    return-void

    .line 591
    :cond_1
    iget-object v0, p0, Lbij;->a:Lbii;

    iget-object v0, v0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->c(Lbhf;)Lbmi;

    move-result-object v0

    .line 2167
    invoke-virtual {v0, v3}, Li;->a(Z)V

    .line 592
    iget-object v0, p0, Lbij;->a:Lbii;

    iget-object v0, v0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->y()V

    .line 594
    iget-object v0, p0, Lbij;->a:Lbii;

    iget-object v0, v0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    .line 2821
    iget-boolean v0, v0, Land;->u:Z

    .line 594
    if-nez v0, :cond_0

    .line 598
    iget-object v0, p0, Lbij;->a:Lbii;

    iget-object v0, v0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    iget-object v1, p0, Lbij;->a:Lbii;

    iget-object v1, v1, Lbii;->a:Lbhf;

    sget v2, Lb;->cc:I

    invoke-virtual {v1, v2}, Lbhf;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 599
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

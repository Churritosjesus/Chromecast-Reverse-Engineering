.class final Lbik;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laop;


# instance fields
.field private synthetic a:Lbij;


# direct methods
.method constructor <init>(Lbij;)V
    .locals 0

    .prologue
    .line 565
    iput-object p1, p0, Lbik;->a:Lbij;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 568
    iget-object v0, p0, Lbik;->a:Lbij;

    iget-object v0, v0, Lbij;->a:Lbii;

    iget-object v0, v0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 577
    :goto_0
    return-void

    .line 571
    :cond_0
    iget-object v0, p0, Lbik;->a:Lbij;

    iget-object v0, v0, Lbij;->a:Lbii;

    iget-object v0, v0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->y()V

    .line 572
    iget-object v0, p0, Lbik;->a:Lbij;

    iget-object v0, v0, Lbij;->a:Lbii;

    iget-object v0, v0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    .line 2821
    iget-boolean v0, v0, Land;->u:Z

    .line 572
    if-eqz v0, :cond_1

    .line 573
    iget-object v0, p0, Lbik;->a:Lbij;

    iget-object v0, v0, Lbij;->a:Lbii;

    iget-object v0, v0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->c(Lbhf;)Lbmi;

    move-result-object v0

    .line 3167
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Li;->a(Z)V

    goto :goto_0

    .line 576
    :cond_1
    iget-object v0, p0, Lbik;->a:Lbij;

    iget-object v0, v0, Lbij;->a:Lbii;

    iget-object v0, v0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->c(Lbhf;)Lbmi;

    move-result-object v0

    invoke-virtual {v0}, Lbmi;->p()V

    goto :goto_0
.end method

.method public final b()V
    .locals 0

    .prologue
    .line 582
    return-void
.end method

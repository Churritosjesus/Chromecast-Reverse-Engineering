.class public final Lbis;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laop;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V
    .locals 0

    .prologue
    .line 730
    iput-object p1, p0, Lbis;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 741
    iget-object v0, p0, Lbis;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;Z)Z

    .line 742
    iget-object v0, p0, Lbis;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v2, v3}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(J)V

    .line 743
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 733
    iget-object v0, p0, Lbis;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;Z)Z

    .line 734
    iget-object v0, p0, Lbis;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->h(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 735
    iget-object v0, p0, Lbis;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    .line 1680
    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->finish()V

    .line 737
    :cond_0
    return-void
.end method

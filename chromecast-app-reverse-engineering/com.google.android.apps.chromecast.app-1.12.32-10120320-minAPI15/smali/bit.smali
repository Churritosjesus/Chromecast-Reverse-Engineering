.class public final Lbit;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laop;


# instance fields
.field private synthetic a:Lbfs;

.field private synthetic b:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;Lbfs;)V
    .locals 0

    .prologue
    .line 795
    iput-object p1, p0, Lbit;->b:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    iput-object p2, p0, Lbit;->a:Lbfs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 799
    iget-object v0, p0, Lbit;->b:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->i(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Lbha;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbit;->a:Lbfs;

    if-eqz v0, :cond_0

    .line 800
    iget-object v0, p0, Lbit;->b:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->i(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Lbha;

    move-result-object v0

    iget-object v1, p0, Lbit;->a:Lbfs;

    .line 1130
    iget-object v1, v1, Lbfs;->a:Ljava/lang/String;

    .line 2051
    iput-object v1, v0, Lbha;->a:Ljava/lang/String;

    .line 805
    :cond_0
    iget-object v0, p0, Lbit;->b:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->g(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 806
    iget-object v0, p0, Lbit;->b:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    sget v1, Lbjo;->f:I

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(I)V

    .line 807
    iget-object v0, p0, Lbit;->b:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->w()V

    .line 809
    :cond_1
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 813
    iget-object v0, p0, Lbit;->b:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->b(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;Z)Z

    .line 814
    iget-object v0, p0, Lbit;->b:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->j(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V

    .line 815
    iget-object v0, p0, Lbit;->b:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->g(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 816
    iget-object v0, p0, Lbit;->b:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->w()V

    .line 818
    :cond_0
    return-void
.end method

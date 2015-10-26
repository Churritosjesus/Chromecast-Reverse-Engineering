.class final Lbic;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laop;


# instance fields
.field final synthetic a:Lbhf;


# direct methods
.method constructor <init>(Lbhf;)V
    .locals 0

    .prologue
    .line 255
    iput-object p1, p0, Lbic;->a:Lbhf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .prologue
    .line 258
    iget-object v0, p0, Lbic;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbic;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    .line 2821
    iget-boolean v0, v0, Land;->u:Z

    .line 258
    if-eqz v0, :cond_1

    .line 284
    :cond_0
    :goto_0
    return-void

    .line 261
    :cond_1
    iget-object v0, p0, Lbic;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    new-instance v7, Lbid;

    invoke-direct {v7, p0}, Lbid;-><init>(Lbic;)V

    .line 3604
    iget-object v0, v0, Land;->p:Lbdu;

    .line 4192
    invoke-virtual {v0}, Lbdu;->d()J

    move-result-wide v2

    .line 4193
    new-instance v4, Lbdp;

    iget-object v1, v0, Lbdu;->d:Ljava/lang/String;

    invoke-direct {v4, v1}, Lbdp;-><init>(Ljava/lang/String;)V

    .line 4194
    const-string v1, "getConfiguredNetworks"

    iget v5, v0, Lbdu;->e:I

    new-instance v6, Lbel;

    invoke-direct {v6, v0, v7, v4}, Lbel;-><init>(Lbdu;Lbdn;Lbdp;)V

    invoke-virtual/range {v0 .. v6}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 288
    iget-object v0, p0, Lbic;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    .line 4821
    iget-boolean v0, v0, Land;->u:Z

    .line 288
    if-eqz v0, :cond_0

    .line 289
    iget-object v0, p0, Lbic;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->y()V

    .line 294
    :goto_0
    return-void

    .line 293
    :cond_0
    iget-object v0, p0, Lbic;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->finish()V

    goto :goto_0
.end method

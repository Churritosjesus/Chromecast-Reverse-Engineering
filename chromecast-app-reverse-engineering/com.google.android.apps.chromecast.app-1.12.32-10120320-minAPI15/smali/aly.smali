.class public final Laly;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 632
    iput-object p1, p0, Laly;->b:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    iput-object p2, p0, Laly;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 632
    check-cast p1, Ldbv;

    .line 1640
    iget-object v0, p0, Laly;->a:Ljava/lang/String;

    const-string v1, "41"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1641
    invoke-static {}, Laku;->a()Laku;

    invoke-static {}, Laku;->b()V

    .line 1645
    :cond_0
    iget-object v0, p0, Laly;->b:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-virtual {v0, p1}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Ldbv;)V

    .line 1646
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Laly;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    .line 632
    return-void
.end method

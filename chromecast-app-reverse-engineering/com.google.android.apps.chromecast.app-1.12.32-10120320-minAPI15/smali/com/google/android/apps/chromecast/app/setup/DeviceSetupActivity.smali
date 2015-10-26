.class public Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;
.super Land;
.source "PG"

# interfaces
.implements Lbgu;
.implements Lbgz;
.implements Lbjd;
.implements Lbjk;
.implements Lbjn;
.implements Lbjt;


# instance fields
.field private A:Z

.field private B:Landroid/bluetooth/BluetoothDevice;

.field private C:Landroid/bluetooth/BluetoothAdapter;

.field private D:Z

.field private E:Lbje;

.field private F:Z

.field private G:Z

.field private H:I

.field private I:I

.field private J:I

.field private K:Ljava/lang/Long;

.field private L:Z

.field private M:Landroid/os/Handler;

.field private N:Ljava/lang/Runnable;

.field public e:Lbdm;

.field public f:Laph;

.field private g:Lbha;

.field private v:Lazj;

.field private w:Z

.field private x:Z

.field private y:Ljava/lang/String;

.field private z:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 150
    const-string v0, "DeviceSetupActivity"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Land;-><init>(Ljava/lang/String;Z)V

    .line 109
    iput-boolean v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->w:Z

    .line 110
    iput-boolean v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->x:Z

    .line 116
    iput-boolean v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->D:Z

    .line 131
    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->H:I

    .line 913
    sget v0, Lbiv;->a:I

    iput v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->I:I

    .line 914
    sget v0, Lbiv;->a:I

    iput v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->J:I

    .line 917
    iput-object v3, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->K:Ljava/lang/Long;

    .line 919
    iput-boolean v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->L:Z

    .line 920
    iput-object v3, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->M:Landroid/os/Handler;

    .line 921
    new-instance v0, Lbim;

    invoke-direct {v0, p0}, Lbim;-><init>(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->N:Ljava/lang/Runnable;

    .line 151
    return-void
.end method

.method private G()V
    .locals 1

    .prologue
    .line 828
    new-instance v0, Lbiu;

    invoke-direct {v0, p0}, Lbiu;-><init>(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 839
    return-void
.end method

.method private H()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 933
    .line 27808
    iget-object v0, p0, Lm;->b:Lt;

    .line 934
    const-string v1, "loadingFragment"

    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v1

    .line 935
    if-eqz v1, :cond_0

    .line 936
    invoke-virtual {v0}, Lr;->a()Laf;

    move-result-object v2

    .line 937
    invoke-virtual {v2, v1}, Laf;->a(Lj;)Laf;

    move-result-object v1

    .line 938
    invoke-virtual {v1}, Laf;->b()I

    .line 940
    :cond_0
    const-string v1, "otaWaitFragment"

    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    .line 941
    instance-of v1, v0, Lbiy;

    if-eqz v1, :cond_3

    .line 942
    check-cast v0, Lbiy;

    .line 28227
    iget-boolean v1, v0, Lbiy;->b:Z

    if-eqz v1, :cond_1

    iget-object v1, v0, Lbiy;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 943
    :cond_1
    :goto_0
    sget v0, Lbiv;->c:I

    iput v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->J:I

    .line 947
    :goto_1
    return-void

    .line 28230
    :cond_2
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, v0, Lbiy;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    .line 28231
    iget-object v1, v0, Lbiy;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V

    .line 28232
    invoke-virtual {v0}, Lbiy;->q()V

    goto :goto_0

    .line 945
    :cond_3
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->t:Lblp;

    const-string v1, "Expected the video to be visible but wasn\'t"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lblp;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1
.end method

.method private I()Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 955
    .line 28915
    iget-object v3, p0, Land;->i:Lbdf;

    .line 29822
    iget v2, v3, Lbdf;->a:I

    const/4 v4, 0x7

    if-lt v2, v4, :cond_0

    move v2, v0

    .line 956
    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v3}, Lbdf;->b()I

    move-result v2

    sget v3, Lbdi;->c:I

    if-eq v2, v3, :cond_1

    :goto_1
    return v0

    :cond_0
    move v2, v1

    .line 29822
    goto :goto_0

    :cond_1
    move v0, v1

    .line 956
    goto :goto_1
.end method

.method private J()V
    .locals 1

    .prologue
    .line 963
    .line 30808
    iget-object v0, p0, Lm;->b:Lt;

    .line 963
    invoke-virtual {v0}, Lr;->a()Laf;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Laf;)V

    .line 964
    return-void
.end method

.method private K()V
    .locals 6

    .prologue
    .line 984
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->K:Ljava/lang/Long;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->M:Landroid/os/Handler;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->J:I

    sget v1, Lbiv;->b:I

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->J:I

    sget v1, Lbiv;->c:I

    if-eq v0, v1, :cond_0

    .line 986
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->K:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 987
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    .line 988
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    iput-object v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->M:Landroid/os/Handler;

    .line 989
    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->M:Landroid/os/Handler;

    iget-object v3, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->N:Ljava/lang/Runnable;

    .line 990
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    add-long/2addr v4, v0

    .line 989
    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    .line 991
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v2, v3

    .line 994
    :cond_0
    return-void
.end method

.method private L()V
    .locals 2

    .prologue
    .line 997
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->M:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 998
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->M:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->N:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 999
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->M:Landroid/os/Handler;

    .line 1001
    :cond_0
    return-void
.end method

.method private M()Z
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 1014
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->K:Ljava/lang/Long;

    if-nez v0, :cond_0

    move v0, v1

    .line 1061
    :goto_0
    return v0

    .line 1019
    :cond_0
    iget v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->J:I

    sget v3, Lbiv;->b:I

    if-eq v0, v3, :cond_1

    iget v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->J:I

    sget v3, Lbiv;->c:I

    if-ne v0, v3, :cond_2

    :cond_1
    move v0, v1

    .line 1021
    goto :goto_0

    .line 1025
    :cond_2
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->K:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-gez v0, :cond_6

    .line 1028
    iput-object v8, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->K:Ljava/lang/Long;

    .line 31808
    iget-object v3, p0, Lm;->b:Lt;

    .line 1031
    const-string v0, "otaWaitFragment"

    .line 1032
    invoke-virtual {v3, v0}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    check-cast v0, Lbjq;

    .line 1033
    invoke-static {p0}, Lblf;->n(Landroid/content/Context;)I

    move-result v4

    .line 1034
    if-eqz v0, :cond_3

    .line 32047
    iget v5, v0, Lbjq;->c:I

    .line 1034
    if-lt v5, v4, :cond_4

    :cond_3
    move v0, v1

    .line 1036
    goto :goto_0

    .line 1038
    :cond_4
    new-array v4, v2, [Ljava/lang/Object;

    .line 33047
    iget v0, v0, Lbjq;->c:I

    .line 1039
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v1

    .line 1040
    invoke-virtual {v3}, Lr;->a()Laf;

    move-result-object v0

    .line 1043
    const-string v1, "pollOtaFragment"

    invoke-virtual {v3, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v1

    .line 1044
    if-eqz v1, :cond_5

    .line 1045
    invoke-virtual {v0, v1}, Laf;->a(Lj;)Laf;

    .line 1046
    sget v1, Lbiv;->d:I

    iput v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->I:I

    .line 1050
    :cond_5
    invoke-virtual {v3, v8, v2}, Lr;->b(Ljava/lang/String;I)Z

    .line 1052
    sget v1, Lf;->ai:I

    sget v3, Lb;->ct:I

    sget v4, Lb;->cs:I

    .line 1053
    invoke-static {v3, v4, v2}, Lbjs;->a(IIZ)Lbjs;

    move-result-object v3

    .line 1052
    invoke-virtual {v0, v1, v3}, Laf;->a(ILj;)Laf;

    .line 1057
    invoke-virtual {v0}, Laf;->b()I

    move v0, v2

    .line 1058
    goto :goto_0

    :cond_6
    move v0, v1

    .line 1061
    goto :goto_0
.end method

.method private N()V
    .locals 2

    .prologue
    .line 1147
    .line 33915
    iget-object v0, p0, Land;->i:Lbdf;

    .line 34314
    iget-boolean v0, v0, Lbdf;->h:Z

    .line 1148
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->f:Laph;

    .line 1147
    invoke-static {p0, v0, v1}, Lcom/google/android/apps/chromecast/app/setup/ota/OtaErrorActivity;->a(Landroid/content/Context;ZLaph;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->startActivity(Landroid/content/Intent;)V

    .line 1150
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->finish()V

    .line 1151
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lbdf;IJLjava/lang/String;Landroid/bluetooth/BluetoothDevice;)Landroid/content/Intent;
    .locals 3

    .prologue
    .line 138
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 139
    const-string v1, "device"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 140
    const-string v1, "deviceIpAddress"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 141
    const-string v1, "deviceConfiguration"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 142
    const-string v1, "devicePosition"

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 143
    const-string v1, "scanStart"

    invoke-virtual {v0, v1, p5, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 144
    const-string v1, "hotspotSsid"

    invoke-virtual {v0, v1, p7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 145
    const-string v1, "bleDevice"

    invoke-virtual {v0, v1, p8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 146
    return-object v0
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Laph;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->f:Laph;

    return-object v0
.end method

.method private a(Laf;)V
    .locals 3

    .prologue
    .line 972
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->K()V

    .line 973
    sget v0, Lf;->ai:I

    .line 975
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->I()Z

    move-result v1

    invoke-static {v1}, Lbix;->a(Z)Lbix;

    move-result-object v1

    const-string v2, "otaWaitFragment"

    .line 973
    invoke-virtual {p1, v0, v1, v2}, Laf;->b(ILj;Ljava/lang/String;)Laf;

    move-result-object v0

    .line 977
    invoke-virtual {v0}, Laf;->b()I

    .line 978
    return-void
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;Z)Z
    .locals 1

    .prologue
    .line 77
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->F:Z

    return v0
.end method

.method private b(Lbfs;)V
    .locals 3

    .prologue
    .line 756
    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Lbfs;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 820
    :goto_0
    return-void

    .line 759
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 761
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->y:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->y:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->D()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 762
    const-string v0, "friendly_name"

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->y:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 767
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->B()Lbdb;

    move-result-object v0

    .line 768
    if-eqz v0, :cond_2

    .line 769
    const-string v2, "timezone"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    :cond_2
    const-string v2, "time_format"

    invoke-static {p0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 772
    sget-object v0, Lbdk;->b:Lbdk;

    .line 771
    :goto_1
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 776
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->C()Lbcz;

    move-result-object v0

    .line 777
    if-eqz v0, :cond_3

    .line 778
    const-string v2, "locale"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 781
    :cond_3
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->z:Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    .line 782
    const-string v0, "opt_in_opencast"

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->z:Ljava/lang/Boolean;

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 784
    :cond_4
    const-string v0, "opt_in_stats"

    iget-boolean v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->A:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 786
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 788
    const/4 v0, 0x0

    .line 793
    :goto_2
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->w:Z

    .line 794
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->n()V

    .line 795
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    new-instance v2, Lbit;

    invoke-direct {v2, p0, p1}, Lbit;-><init>(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;Lbfs;)V

    invoke-virtual {p0, v1, v0, p1, v2}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Lbdm;Ljava/util/HashMap;Lbfs;Laop;)V

    goto :goto_0

    .line 773
    :cond_5
    sget-object v0, Lbdk;->a:Lbdk;

    goto :goto_1

    :cond_6
    move-object v0, v1

    goto :goto_2
.end method

.method public static synthetic b(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V
    .locals 3

    .prologue
    .line 77
    .line 35915
    iget-object v0, p0, Land;->i:Lbdf;

    .line 36443
    iget-boolean v0, v0, Lbdf;->w:Z

    .line 35435
    if-eqz v0, :cond_0

    .line 35436
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->s()V

    .line 35437
    :goto_0
    return-void

    .line 35441
    :cond_0
    const/4 v0, 0x0

    .line 35442
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 36915
    iget-object v1, p0, Land;->i:Lbdf;

    .line 37787
    invoke-virtual {v1}, Lbdf;->a()I

    move-result v1

    .line 37788
    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    const/16 v2, 0x3a10

    if-lt v1, v2, :cond_3

    :cond_1
    const/4 v1, 0x1

    .line 35442
    :goto_1
    if-eqz v1, :cond_2

    .line 35443
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 38335
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->c:Ljava/lang/String;

    .line 35445
    :cond_2
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    new-instance v2, Lbio;

    invoke-direct {v2, p0}, Lbio;-><init>(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V

    invoke-virtual {p0, v1, v0, v2}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Lbdm;Ljava/lang/String;Laop;)V

    goto :goto_0

    .line 37788
    :cond_3
    const/4 v1, 0x0

    goto :goto_1
.end method

.method public static synthetic b(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;Z)Z
    .locals 1

    .prologue
    .line 77
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->w:Z

    return v0
.end method

.method public static synthetic c(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Z
    .locals 1

    .prologue
    .line 77
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->u:Z

    return v0
.end method

.method public static synthetic d(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->s()V

    return-void
.end method

.method public static synthetic e(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Z
    .locals 1

    .prologue
    .line 77
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->u:Z

    return v0
.end method

.method public static synthetic f(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Z
    .locals 1

    .prologue
    .line 77
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->u:Z

    return v0
.end method

.method public static synthetic g(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Z
    .locals 1

    .prologue
    .line 77
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->G:Z

    return v0
.end method

.method public static synthetic h(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Z
    .locals 1

    .prologue
    .line 77
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->u:Z

    return v0
.end method

.method public static synthetic i(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Lbha;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->g:Lbha;

    return-object v0
.end method

.method public static synthetic j(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->n()V

    return-void
.end method

.method public static synthetic k(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->r()V

    return-void
.end method

.method public static synthetic l(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V
    .locals 1

    .prologue
    .line 77
    .line 38687
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->x()V

    .line 38689
    new-instance v0, Lbir;

    invoke-direct {v0, p0}, Lbir;-><init>(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V

    .line 38690
    invoke-static {p0, v0}, Lblj;->a(Lm;Lbln;)V

    .line 77
    return-void
.end method

.method public static synthetic m(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)Z
    .locals 1

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->M()Z

    move-result v0

    return v0
.end method

.method private n()V
    .locals 6

    .prologue
    .line 284
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->w:Z

    if-eqz v0, :cond_2

    .line 285
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->v:Lazj;

    if-nez v0, :cond_0

    .line 286
    new-instance v0, Lazj;

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    invoke-direct {v0, p0, v1}, Lazj;-><init>(Landroid/content/Context;Lbdm;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->v:Lazj;

    .line 288
    :cond_0
    iget-object v4, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->v:Lazj;

    .line 8048
    iget-object v0, v4, Lazj;->a:Ljava/util/Timer;

    if-nez v0, :cond_1

    .line 8049
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, v4, Lazj;->a:Ljava/util/Timer;

    .line 8050
    iget-object v0, v4, Lazj;->a:Ljava/util/Timer;

    new-instance v1, Lazl;

    invoke-direct {v1, v4}, Lazl;-><init>(Lazj;)V

    iget-wide v2, v4, Lazj;->d:J

    iget-wide v4, v4, Lazj;->d:J

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 294
    :cond_1
    :goto_0
    return-void

    .line 290
    :cond_2
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->v:Lazj;

    if-eqz v0, :cond_1

    .line 291
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->v:Lazj;

    invoke-virtual {v0}, Lazj;->a()V

    goto :goto_0
.end method

.method private o()V
    .locals 1

    .prologue
    .line 306
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->E:Lbje;

    if-eqz v0, :cond_0

    .line 307
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->E:Lbje;

    invoke-virtual {v0}, Lbje;->a()V

    .line 309
    :cond_0
    return-void
.end method

.method private p()Lbdm;
    .locals 6

    .prologue
    .line 389
    new-instance v0, Lbdu;

    const-string v1, "192.168.255.249"

    .line 8915
    iget-object v2, p0, Land;->i:Lbdf;

    .line 9239
    iget v2, v2, Lbdf;->a:I

    .line 390
    iget-object v3, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->o:Ljava/lang/String;

    sget v4, Lbew;->d:I

    .line 9892
    iget-object v5, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->f:Laph;

    .line 391
    invoke-direct/range {v0 .. v5}, Lbdu;-><init>(Ljava/lang/String;ILjava/lang/String;ILaph;)V

    .line 10144
    const/4 v1, 0x1

    iput-boolean v1, v0, Lbdu;->g:Z

    .line 10145
    iget-object v1, v0, Lbdu;->f:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 10146
    iget-object v1, v0, Lbdu;->h:Lazv;

    iget-object v2, v0, Lbdu;->f:Ljava/lang/String;

    .line 11093
    iput-object v2, v1, Lazv;->j:Ljava/lang/String;

    .line 392
    :cond_0
    return-object v0
.end method

.method private q()Lbdm;
    .locals 3

    .prologue
    .line 397
    new-instance v0, Lava;

    new-instance v1, Lauv;

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->B:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {v1, v2, p0}, Lauv;-><init>(Landroid/bluetooth/BluetoothDevice;Landroid/content/Context;)V

    .line 11915
    iget-object v2, p0, Land;->i:Lbdf;

    .line 398
    invoke-direct {v0, v1, v2, p0}, Lava;-><init>(Lauv;Lbdf;Landroid/content/Context;)V

    return-object v0
.end method

.method private r()V
    .locals 4

    .prologue
    .line 413
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->x()V

    .line 414
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    new-instance v1, Lbil;

    invoke-direct {v1, p0}, Lbil;-><init>(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    .line 431
    invoke-virtual {v3}, Lbdm;->c()Z

    move-result v3

    .line 414
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Lbdm;Laop;ZZ)V

    .line 432
    return-void
.end method

.method private s()V
    .locals 1

    .prologue
    .line 468
    new-instance v0, Lbip;

    invoke-direct {v0, p0}, Lbip;-><init>(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Laop;)V

    .line 484
    return-void
.end method


# virtual methods
.method public final A()Laph;
    .locals 1

    .prologue
    .line 892
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->f:Laph;

    return-object v0
.end method

.method public final a()V
    .locals 0

    .prologue
    .line 719
    .line 25680
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->finish()V

    .line 720
    return-void
.end method

.method public final a(I)V
    .locals 12

    .prologue
    const-wide/16 v10, 0x0

    const/4 v0, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x1

    .line 493
    .line 13808
    iget-object v2, p0, Lm;->b:Lt;

    .line 495
    invoke-virtual {v2}, Lr;->a()Laf;

    move-result-object v5

    .line 496
    new-instance v6, Lapd;

    const/16 v7, 0x8b

    invoke-direct {v6, v7}, Lapd;-><init>(I)V

    .line 497
    sget-object v7, Lbin;->a:[I

    add-int/lit8 v8, p1, -0x1

    aget v7, v7, v8

    packed-switch v7, :pswitch_data_0

    .line 669
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Unrecognized setup flow state"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 499
    :pswitch_0
    iget-boolean v7, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->D:Z

    if-eqz v7, :cond_2

    .line 500
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.bluetooth.adapter.action.REQUEST_ENABLE"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 501
    invoke-virtual {p0, v0, v1}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 672
    :cond_0
    :goto_0
    if-eqz v3, :cond_1

    .line 25077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 673
    invoke-virtual {v0, v3}, Lmj;->a(Ljava/lang/CharSequence;)V

    .line 675
    :cond_1
    invoke-virtual {v5}, Laf;->b()I

    .line 676
    :goto_1
    return-void

    .line 504
    :cond_2
    sget v3, Lb;->aR:I

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->D()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v4

    invoke-virtual {p0, v3, v7}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v7, Lbiq;

    invoke-direct {v7, p0}, Lbiq;-><init>(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V

    invoke-virtual {p0, v3, v7}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 511
    sget v3, Lb;->aD:I

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->D()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v4

    invoke-virtual {p0, v3, v7}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 512
    sget v4, Lf;->ai:I

    invoke-virtual {v2, v4}, Lr;->a(I)Lj;

    move-result-object v2

    invoke-virtual {v5, v2}, Laf;->a(Lj;)Laf;

    .line 513
    iget v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->H:I

    if-ne v2, v1, :cond_4

    .line 514
    invoke-static {}, Lape;->a()Lape;

    move-result-object v2

    iget-object v4, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->C:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->C:Landroid/bluetooth/BluetoothAdapter;

    .line 515
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v4

    if-eqz v4, :cond_3

    move v0, v1

    .line 514
    :cond_3
    invoke-virtual {v6, v0}, Lapd;->a(I)Lapd;

    move-result-object v0

    invoke-virtual {v2, v0}, Lape;->a(Lapd;)V

    .line 517
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->C:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->C:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 519
    invoke-static {}, Lblx;->a()Z

    .line 527
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    if-eqz v0, :cond_0

    .line 528
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->G()V

    goto :goto_0

    .line 524
    :cond_5
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->p()Lbdm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    goto :goto_2

    .line 532
    :pswitch_1
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->w()V

    .line 13915
    iget-object v0, p0, Land;->i:Lbdf;

    .line 14314
    iget-boolean v0, v0, Lbdf;->h:Z

    .line 533
    if-nez v0, :cond_6

    .line 534
    iput-boolean v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->x:Z

    .line 535
    invoke-virtual {p0, v10, v11}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(J)V

    .line 536
    sget v0, Lf;->ai:I

    new-instance v1, Lbgt;

    invoke-direct {v1}, Lbgt;-><init>()V

    invoke-virtual {v5, v0, v1}, Laf;->a(ILj;)Laf;

    goto/16 :goto_0

    .line 538
    :cond_6
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->l:Z

    if-eqz v0, :cond_7

    .line 540
    iput-boolean v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->w:Z

    .line 541
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->n()V

    .line 542
    sget v0, Lf;->ai:I

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->q:Ljava/lang/String;

    .line 543
    invoke-static {v1}, Lbhd;->a(Ljava/lang/String;)Lbhd;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Laf;->a(ILj;)Laf;

    goto/16 :goto_0

    .line 548
    :cond_7
    :pswitch_2
    iput-boolean v4, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->x:Z

    .line 549
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->o()V

    .line 550
    sget v0, Lf;->ai:I

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    .line 551
    invoke-virtual {v1}, Lbdm;->b()Z

    move-result v1

    invoke-static {v1}, Lbgo;->a(Z)Lbgo;

    move-result-object v1

    const-string v2, "configureDeviceFragment"

    .line 550
    invoke-virtual {v5, v0, v1, v2}, Laf;->b(ILj;Ljava/lang/String;)Laf;

    goto/16 :goto_0

    .line 555
    :pswitch_3
    iput-boolean v4, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->x:Z

    .line 556
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->o()V

    .line 557
    const-string v0, "configureDeviceFragment"

    .line 558
    invoke-virtual {v2, v0}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    check-cast v0, Lbgo;

    .line 559
    invoke-virtual {v0}, Lbgo;->p()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->y:Ljava/lang/String;

    .line 15160
    iget-object v2, v0, Lbgo;->a:Landroid/widget/CheckBox;

    if-nez v2, :cond_8

    move-object v2, v3

    .line 560
    :goto_3
    iput-object v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->z:Ljava/lang/Boolean;

    .line 15167
    iget-object v0, v0, Lbgo;->b:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    .line 561
    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->A:Z

    .line 562
    sget v0, Lb;->aD:I

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->y:Ljava/lang/String;

    aput-object v2, v1, v4

    invoke-virtual {p0, v0, v1}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 15915
    iget-object v1, p0, Land;->i:Lbdf;

    .line 16443
    iget-boolean v1, v1, Lbdf;->w:Z

    .line 563
    if-eqz v1, :cond_9

    .line 565
    invoke-direct {p0, v3}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->b(Lbfs;)V

    move-object v3, v0

    goto/16 :goto_0

    .line 15163
    :cond_8
    iget-object v2, v0, Lbgo;->a:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_3

    .line 567
    :cond_9
    sget v1, Lf;->ai:I

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->n:Lbfs;

    iget-object v4, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    .line 569
    invoke-virtual {v4}, Lbdm;->b()Z

    move-result v4

    .line 568
    invoke-static {v2, v4}, Lbgr;->a(Lbfs;Z)Lbgr;

    move-result-object v2

    const-string v4, "configureWifiFragment"

    .line 567
    invoke-virtual {v5, v1, v2, v4}, Laf;->b(ILj;Ljava/lang/String;)Laf;

    move-result-object v1

    .line 571
    invoke-virtual {v1, v3}, Laf;->a(Ljava/lang/String;)Laf;

    move-object v3, v0

    .line 573
    goto/16 :goto_0

    .line 575
    :pswitch_4
    const-string v0, "configureWifiFragment"

    .line 576
    invoke-virtual {v2, v0}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    check-cast v0, Lbgr;

    .line 17114
    iget-object v0, v0, Lbgr;->a:Lbos;

    invoke-virtual {v0}, Lbos;->a()Lbfs;

    move-result-object v0

    .line 577
    invoke-direct {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->b(Lbfs;)V

    goto/16 :goto_1

    .line 18077
    :pswitch_5
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 581
    invoke-virtual {v0, v3}, Lmj;->a(Ljava/lang/CharSequence;)V

    .line 19077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 582
    invoke-virtual {v0}, Lmj;->d()V

    .line 583
    invoke-static {p0}, Lblx;->h(Landroid/app/Activity;)V

    .line 586
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->m:Lbdj;

    sget-object v6, Lbdj;->p:Lbdj;

    if-ne v0, v6, :cond_a

    move v0, v1

    .line 589
    :goto_4
    invoke-virtual {v2, v3, v1}, Lr;->b(Ljava/lang/String;I)Z

    .line 590
    if-nez v0, :cond_b

    .line 591
    sget v0, Lf;->ai:I

    .line 19915
    iget-object v1, p0, Land;->i:Lbdf;

    .line 20354
    iget-wide v6, v1, Lbdf;->m:J

    .line 593
    invoke-static {v6, v7}, Lbjp;->a(J)Lbjp;

    move-result-object v1

    .line 591
    invoke-virtual {v5, v0, v1}, Laf;->a(ILj;)Laf;

    goto/16 :goto_0

    :cond_a
    move v0, v4

    .line 586
    goto :goto_4

    .line 595
    :cond_b
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->I()Z

    move-result v0

    if-nez v0, :cond_c

    .line 596
    invoke-direct {p0, v5}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Laf;)V

    goto/16 :goto_1

    .line 600
    :cond_c
    invoke-static {p0}, Lblf;->o(Landroid/content/Context;)J

    move-result-wide v6

    .line 601
    cmp-long v0, v6, v10

    if-lez v0, :cond_d

    .line 602
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    add-long/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->K:Ljava/lang/Long;

    .line 606
    :cond_d
    invoke-static {p0}, Lblf;->i(Landroid/content/Context;)J

    move-result-wide v6

    .line 607
    invoke-static {p0}, Lblf;->j(Landroid/content/Context;)I

    move-result v0

    .line 608
    invoke-static {p0}, Lblf;->k(Landroid/content/Context;)I

    move-result v2

    .line 605
    invoke-static {v6, v7, v0, v2}, Lbjh;->a(JII)Lbjh;

    move-result-object v0

    const-string v2, "pollOtaFragment"

    .line 604
    invoke-virtual {v5, v0, v2}, Laf;->a(Lj;Ljava/lang/String;)Laf;

    .line 20915
    iget-object v0, p0, Land;->i:Lbdf;

    .line 21314
    iget-boolean v0, v0, Lbdf;->h:Z

    .line 610
    if-eqz v0, :cond_e

    .line 611
    invoke-direct {p0, v5}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Laf;)V

    goto/16 :goto_1

    .line 616
    :cond_e
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->g()Z

    move-result v0

    if-nez v0, :cond_f

    .line 617
    invoke-direct {p0, v5}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Laf;)V

    goto/16 :goto_1

    .line 620
    :cond_f
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 21335
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->c:Ljava/lang/String;

    .line 621
    invoke-static {}, Lblj;->b()Ljava/lang/String;

    move-result-object v2

    .line 623
    invoke-static {p0, v0, v2}, Lblf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 624
    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v4

    .line 626
    invoke-static {v0}, Lbiy;->a(Ljava/lang/String;)Lbiy;

    move-result-object v0

    .line 628
    sget v1, La;->gz:I

    .line 629
    invoke-static {v1}, Lbok;->b(I)Lbok;

    move-result-object v1

    .line 630
    sget v2, Lf;->ai:I

    const-string v4, "otaWaitFragment"

    .line 631
    invoke-virtual {v5, v2, v0, v4}, Laf;->b(ILj;Ljava/lang/String;)Laf;

    move-result-object v0

    sget v2, Lf;->ai:I

    const-string v4, "loadingFragment"

    .line 632
    invoke-virtual {v0, v2, v1, v4}, Laf;->a(ILj;Ljava/lang/String;)Laf;

    goto/16 :goto_0

    .line 638
    :pswitch_6
    const-string v4, "pollOtaFragment"

    invoke-virtual {v2, v4}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v2

    .line 639
    if-eqz v2, :cond_10

    .line 640
    invoke-virtual {v5, v2}, Laf;->a(Lj;)Laf;

    .line 21915
    :cond_10
    iget-object v2, p0, Land;->i:Lbdf;

    .line 644
    invoke-static {}, Lbkh;->a()Lbkh;

    move-result-object v4

    .line 22071
    iget-object v4, v4, Lbkh;->h:Lblv;

    .line 645
    invoke-virtual {v2}, Lbdf;->b()I

    move-result v6

    invoke-virtual {v4, v3, v1, v6}, Lblv;->a(Ljava/lang/Integer;ZI)Ldan;

    move-result-object v1

    .line 647
    if-eqz v1, :cond_11

    .line 649
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->I()Z

    move-result v4

    iget-object v6, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->f:Laph;

    .line 648
    invoke-static {p0, v1, v2, v4, v6}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->a(Landroid/content/Context;Ldan;Lbdf;ZLaph;)Landroid/content/Intent;

    move-result-object v1

    .line 650
    invoke-virtual {p0, v1, v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto/16 :goto_0

    .line 654
    :cond_11
    sget v0, Lf;->ai:I

    .line 22915
    iget-object v1, p0, Land;->i:Lbdf;

    .line 23354
    iget-wide v6, v1, Lbdf;->m:J

    .line 656
    invoke-static {v6, v7}, Lbjp;->a(J)Lbjp;

    move-result-object v1

    .line 654
    invoke-virtual {v5, v0, v1}, Laf;->a(ILj;)Laf;

    goto/16 :goto_0

    .line 660
    :pswitch_7
    sget v0, Lf;->ai:I

    .line 23915
    iget-object v1, p0, Land;->i:Lbdf;

    .line 24354
    iget-wide v6, v1, Lbdf;->m:J

    .line 662
    invoke-static {v6, v7}, Lbjp;->a(J)Lbjp;

    move-result-object v1

    .line 660
    invoke-virtual {v5, v0, v1}, Laf;->a(ILj;)Laf;

    goto/16 :goto_0

    .line 666
    :pswitch_8
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->h()Lana;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a(Landroid/content/Context;Lana;)Landroid/content/Intent;

    move-result-object v0

    .line 665
    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_1

    .line 497
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method public final a(II)V
    .locals 5

    .prologue
    .line 1091
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->t:Lblp;

    const-string v1, "Couldn\'t play video. Showing static update screen instead. MediaPlayer error: %d, %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 1092
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    .line 1091
    invoke-virtual {v0, v1, v2}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1093
    sget v0, Lbiv;->d:I

    iput v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->J:I

    .line 1094
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->M()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1095
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->J()V

    .line 1097
    :cond_0
    return-void
.end method

.method public final a(J)V
    .locals 3

    .prologue
    .line 298
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->E:Lbje;

    if-nez v0, :cond_0

    .line 299
    new-instance v0, Lbje;

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    invoke-direct {v0, v1}, Lbje;-><init>(Lbdm;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->E:Lbje;

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->E:Lbje;

    .line 8058
    invoke-virtual {v0}, Lbje;->a()V

    .line 8059
    const/4 v1, 0x1

    iput-boolean v1, v0, Lbje;->e:Z

    .line 8060
    iget-object v1, v0, Lbje;->a:Landroid/os/Handler;

    iget-object v0, v0, Lbje;->b:Ljava/lang/Runnable;

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 302
    return-void
.end method

.method public final a_(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 710
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 25342
    iput-object p1, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->c:Ljava/lang/String;

    .line 711
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 712
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->r()V

    .line 714
    :cond_0
    return-void
.end method

.method public final a_(Z)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 724
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->o()V

    .line 726
    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->F:Z

    if-eqz v1, :cond_0

    .line 750
    :goto_0
    return-void

    .line 729
    :cond_0
    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->F:Z

    .line 730
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    new-instance v2, Lbis;

    invoke-direct {v2, p0}, Lbis;-><init>(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V

    .line 26384
    new-instance v3, Laoc;

    invoke-direct {v3, p0, v2}, Laoc;-><init>(Land;Laop;)V

    invoke-virtual {v1, v3, v0}, Lbdm;->a(Lbdn;I)V

    .line 746
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    new-instance v2, Lapd;

    const/16 v3, 0x9b

    invoke-direct {v2, v3}, Lapd;-><init>(I)V

    if-eqz p1, :cond_1

    .line 748
    :goto_1
    invoke-virtual {v2, v0}, Lapd;->a(I)Lapd;

    move-result-object v0

    .line 26892
    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->f:Laph;

    .line 27115
    iput-object v2, v0, Lapd;->h:Laph;

    .line 746
    invoke-virtual {v1, v0}, Lape;->a(Lapd;)V

    goto :goto_0

    .line 748
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final b(I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1103
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    .line 1104
    sget v0, Lbiv;->b:I

    iput v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->I:I

    .line 1105
    iget v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->J:I

    sget v1, Lbiv;->b:I

    if-ne v0, v1, :cond_0

    .line 1106
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->H()V

    .line 33808
    :cond_0
    iget-object v0, p0, Lm;->b:Lt;

    .line 1109
    const-string v1, "otaWaitFragment"

    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    check-cast v0, Lbjq;

    .line 1110
    if-eqz v0, :cond_1

    .line 1111
    invoke-virtual {v0, p1}, Lbjq;->b(I)V

    .line 1113
    :cond_1
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->L:Z

    if-eqz v0, :cond_2

    .line 1114
    iput-boolean v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->L:Z

    .line 1115
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->M()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1116
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->K()V

    .line 1119
    :cond_2
    return-void
.end method

.method public final g()V
    .locals 2

    .prologue
    .line 1068
    sget v0, Lbiv;->b:I

    iput v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->J:I

    .line 1069
    iget v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->I:I

    sget v1, Lbiv;->b:I

    if-ne v0, v1, :cond_0

    .line 1070
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->H()V

    .line 1072
    :cond_0
    return-void
.end method

.method public final h()V
    .locals 2

    .prologue
    .line 1077
    sget v0, Lbiv;->d:I

    iput v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->J:I

    .line 1078
    iget v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->I:I

    sget v1, Lbiv;->d:I

    if-ne v0, v1, :cond_1

    .line 1079
    sget v0, Lbjo;->g:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(I)V

    .line 1086
    :cond_0
    :goto_0
    return-void

    .line 1081
    :cond_1
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->M()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1083
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->J()V

    goto :goto_0
.end method

.method public final i()V
    .locals 2

    .prologue
    .line 1123
    sget v0, Lbiv;->d:I

    iput v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->I:I

    .line 1124
    iget v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->J:I

    sget v1, Lbiv;->c:I

    if-ne v0, v1, :cond_0

    .line 1130
    :goto_0
    return-void

    .line 1127
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->K:Ljava/lang/Long;

    .line 1128
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->L()V

    .line 1129
    sget v0, Lbjo;->g:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(I)V

    goto :goto_0
.end method

.method public final j()V
    .locals 0

    .prologue
    .line 1136
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->i()V

    .line 1137
    return-void
.end method

.method public final k()V
    .locals 1

    .prologue
    .line 1141
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->K:Ljava/lang/Long;

    .line 1142
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->L()V

    .line 1143
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->N()V

    .line 1144
    return-void
.end method

.method public final l()V
    .locals 0

    .prologue
    .line 1158
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->finish()V

    .line 1159
    return-void
.end method

.method public final m()V
    .locals 1

    .prologue
    .line 1163
    .line 34915
    iget-object v0, p0, Land;->i:Lbdf;

    .line 35314
    iget-boolean v0, v0, Lbdf;->h:Z

    .line 1163
    if-eqz v0, :cond_0

    .line 1164
    invoke-static {p0}, Lblf;->p(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 1166
    :goto_0
    invoke-static {p0, v0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->startActivity(Landroid/content/Intent;)V

    .line 1168
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->finish()V

    .line 1169
    return-void

    .line 1165
    :cond_0
    invoke-static {p0}, Lblf;->q(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .prologue
    const/4 v0, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 365
    if-ne p1, v3, :cond_1

    .line 366
    iput-boolean v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->D:Z

    .line 367
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    .line 368
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v3

    .line 369
    iput p1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->H:I

    .line 386
    :cond_0
    :goto_0
    return-void

    .line 370
    :cond_1
    if-ne p1, v0, :cond_0

    .line 371
    if-nez p2, :cond_3

    .line 372
    if-eqz p3, :cond_2

    const-string v0, "hadError"

    .line 373
    invoke-virtual {p3, v0, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 375
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->N()V

    goto :goto_0

    .line 379
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->finish()V

    goto :goto_0

    .line 381
    :cond_3
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 383
    iput p1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->H:I

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    .line 155
    invoke-super {p0, p1}, Land;->onCreate(Landroid/os/Bundle;)V

    .line 157
    sget v0, La;->fV:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->setContentView(I)V

    .line 158
    invoke-static {p0}, Lblx;->g(Landroid/app/Activity;)V

    .line 159
    sget v0, Lf;->eo:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    .line 160
    invoke-virtual {p0, p1}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Landroid/os/Bundle;)V

    .line 162
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 245
    :goto_0
    return-void

    .line 165
    :cond_0
    if-eqz p1, :cond_1

    .line 166
    const-string v0, "bleDevice"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->B:Landroid/bluetooth/BluetoothDevice;

    .line 169
    :cond_1
    invoke-static {}, Lblx;->a()Z

    .line 178
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->B:Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_2

    .line 179
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "bleDevice"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->B:Landroid/bluetooth/BluetoothDevice;

    .line 2915
    :cond_2
    iget-object v0, p0, Land;->i:Lbdf;

    .line 3443
    iget-boolean v0, v0, Lbdf;->w:Z

    .line 181
    if-eqz v0, :cond_6

    .line 3833
    iget-object v0, p0, Land;->p:Lbdu;

    .line 183
    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    .line 4808
    :goto_1
    iget-object v0, p0, Lm;->b:Lt;

    .line 202
    if-nez p1, :cond_8

    .line 5077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v1

    invoke-virtual {v1}, Lnh;->a()Lmj;

    move-result-object v1

    .line 204
    sget v2, Lb;->by:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->D()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {p0, v2, v3}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lmj;->a(Ljava/lang/CharSequence;)V

    .line 206
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "devicePosition"

    const/4 v3, -0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 207
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "scanStart"

    const-wide/16 v4, 0x0

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    .line 205
    invoke-static {v1, v2, v3}, Lbjl;->a(IJ)Lbjl;

    move-result-object v1

    .line 209
    invoke-virtual {v0}, Lr;->a()Laf;

    move-result-object v0

    .line 210
    iget-boolean v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->l:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->n:Lbfs;

    if-eqz v2, :cond_3

    .line 211
    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->o:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->n:Lbfs;

    .line 5130
    iget-object v3, v3, Lbfs;->a:Ljava/lang/String;

    .line 212
    invoke-static {v2, v3}, Lbha;->a(Ljava/lang/String;Ljava/lang/String;)Lbha;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->g:Lbha;

    .line 213
    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->g:Lbha;

    const-string v3, "hotspotManagerTag"

    invoke-virtual {v0, v2, v3}, Laf;->a(Lj;Ljava/lang/String;)Laf;

    .line 215
    :cond_3
    sget v2, Lf;->ai:I

    invoke-virtual {v0, v2, v1}, Laf;->a(ILj;)Laf;

    move-result-object v0

    invoke-virtual {v0}, Laf;->b()I

    .line 240
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->f:Laph;

    if-nez v0, :cond_5

    .line 241
    new-instance v0, Laph;

    invoke-direct {v0}, Laph;-><init>()V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->f:Laph;

    .line 243
    :cond_5
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->f:Laph;

    .line 7915
    iget-object v1, p0, Land;->i:Lbdf;

    .line 243
    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    instance-of v2, v2, Lava;

    invoke-virtual {v0, v1, v2}, Laph;->a(Lbdf;Z)Laph;

    goto/16 :goto_0

    .line 184
    :cond_6
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->B:Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->C:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->C:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 186
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->q()Lbdm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    goto/16 :goto_1

    .line 187
    :cond_7
    invoke-static {}, Lblx;->a()Z

    .line 198
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->p()Lbdm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    goto/16 :goto_1

    .line 217
    :cond_8
    const-string v0, "setupStarted"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->w:Z

    .line 218
    const-string v0, "playSound"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->x:Z

    .line 219
    const-string v0, "actionBarTitle"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 6077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v1

    invoke-virtual {v1}, Lnh;->a()Lmj;

    move-result-object v1

    .line 220
    invoke-virtual {v1, v0}, Lmj;->a(Ljava/lang/CharSequence;)V

    .line 221
    if-nez v0, :cond_9

    .line 7077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 222
    invoke-virtual {v0}, Lmj;->d()V

    .line 224
    invoke-static {p0}, Lblx;->h(Landroid/app/Activity;)V

    .line 226
    :cond_9
    const-string v0, "setupPinCode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->q:Ljava/lang/String;

    .line 227
    const-string v0, "friendlyName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->y:Ljava/lang/String;

    .line 228
    const-string v0, "lastActivityResultRequestCode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->H:I

    .line 229
    const-string v0, "enableOpencast"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 230
    const-string v0, "enableOpencast"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->z:Ljava/lang/Boolean;

    .line 232
    :cond_a
    const-string v0, "statsOptIn"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->A:Z

    .line 233
    const-string v0, "deviceSetupSession"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Laph;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->f:Laph;

    .line 234
    invoke-static {}, Lbiv;->a()[I

    move-result-object v0

    const-string v1, "pollingState"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    aget v0, v0, v1

    iput v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->I:I

    .line 235
    invoke-static {}, Lbiv;->a()[I

    move-result-object v0

    const-string v1, "videoState"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    aget v0, v0, v1

    iput v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->J:I

    .line 236
    const-string v0, "checkOtaSlowTimestamp"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 237
    const-string v0, "checkOtaSlowTimestamp"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->K:Ljava/lang/Long;

    goto/16 :goto_2
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 249
    invoke-super {p0, p1}, Land;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    .line 250
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    .line 251
    sget v1, La;->hd:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 252
    const/4 v0, 0x1

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .prologue
    .line 257
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    .line 258
    invoke-static {p0}, Lat;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    .line 259
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 260
    invoke-static {p0, v0}, Lat;->b(Landroid/app/Activity;Landroid/content/Intent;)V

    .line 264
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 262
    :cond_0
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(Landroid/view/MenuItem;Lbdm;Ljava/lang/String;)Z

    goto :goto_0
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 330
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->v:Lazj;

    if-eqz v0, :cond_0

    .line 331
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->v:Lazj;

    invoke-virtual {v0}, Lazj;->a()V

    .line 333
    :cond_0
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->E:Lbje;

    if-eqz v0, :cond_1

    .line 334
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->E:Lbje;

    invoke-virtual {v0}, Lbje;->a()V

    .line 336
    :cond_1
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->L()V

    .line 337
    invoke-super {p0}, Land;->onPause()V

    .line 338
    return-void
.end method

.method protected onPostResume()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 313
    invoke-super {p0}, Land;->onPostResume()V

    .line 315
    iget v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->H:I

    packed-switch v0, :pswitch_data_0

    .line 326
    :goto_0
    return-void

    .line 318
    :pswitch_0
    sget v0, Lbjo;->a:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(I)V

    .line 319
    iput v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->H:I

    goto :goto_0

    .line 322
    :pswitch_1
    sget v0, Lbjo;->h:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(I)V

    .line 323
    iput v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->H:I

    goto :goto_0

    .line 315
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 269
    invoke-super {p0}, Land;->onResume()V

    .line 270
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->G:Z

    .line 271
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->n()V

    .line 272
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->x:Z

    if-eqz v0, :cond_0

    .line 273
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a(J)V

    .line 276
    :cond_0
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->K:Ljava/lang/Long;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->M:Landroid/os/Handler;

    if-nez v0, :cond_1

    .line 279
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->L:Z

    .line 281
    :cond_1
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 342
    invoke-super {p0, p1}, Land;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 343
    const-string v0, "setupStarted"

    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->w:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 344
    const-string v0, "playSound"

    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->x:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 345
    const-string v0, "actionBarTitle"

    .line 8077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v1

    invoke-virtual {v1}, Lnh;->a()Lmj;

    move-result-object v1

    .line 345
    invoke-virtual {v1}, Lmj;->a()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 346
    const-string v0, "setupPinCode"

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->q:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    const-string v0, "friendlyName"

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->y:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    const-string v0, "lastActivityResultRequestCode"

    iget v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->H:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 349
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->z:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 350
    const-string v0, "enableOpencast"

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->z:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 352
    :cond_0
    const-string v0, "statsOptIn"

    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->A:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 353
    const-string v0, "deviceSetupSession"

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->f:Laph;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 354
    const-string v0, "bleDevice"

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->B:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 355
    const-string v0, "pollingState"

    iget v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->I:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 356
    const-string v0, "videoState"

    iget v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->J:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 357
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->K:Ljava/lang/Long;

    if-eqz v0, :cond_1

    .line 358
    const-string v0, "checkOtaSlowTimestamp"

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->K:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 360
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->G:Z

    .line 361
    return-void
.end method

.method public final v()V
    .locals 1

    .prologue
    .line 406
    invoke-super {p0}, Land;->v()V

    .line 12915
    iget-object v0, p0, Land;->i:Lbdf;

    .line 13443
    iget-boolean v0, v0, Lbdf;->w:Z

    .line 407
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    if-eqz v0, :cond_0

    .line 408
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->e:Lbdm;

    invoke-virtual {v0}, Lbdm;->a()V

    .line 410
    :cond_0
    return-void
.end method

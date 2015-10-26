.class public Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;
.super Land;
.source "PG"

# interfaces
.implements Laqc;
.implements Laqw;
.implements Larc;
.implements Lasq;
.implements Lbca;


# static fields
.field private static v:Ljava/lang/String; = "backdropSettingsFragment"


# instance fields
.field public e:Lbhf;

.field public f:Ljava/lang/String;

.field public g:Lash;

.field private w:Lapu;

.field private x:Lr;

.field private y:Z

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 91
    const-string v0, "DeviceSettingsActivity"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Land;-><init>(Ljava/lang/String;Z)V

    .line 92
    return-void
.end method

.method private G()V
    .locals 2

    .prologue
    .line 360
    iget v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->z:I

    sget v1, Laqx;->a:I

    if-ne v0, v1, :cond_1

    .line 15352
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 361
    invoke-virtual {v0}, Lash;->r()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 362
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->i()V

    .line 367
    :cond_0
    :goto_0
    return-void

    .line 363
    :cond_1
    iget v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->z:I

    sget v1, Laqx;->b:I

    if-ne v0, v1, :cond_0

    .line 16352
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 364
    invoke-virtual {v0}, Lash;->r()Z

    move-result v0

    if-nez v0, :cond_0

    .line 365
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->k()V

    goto :goto_0
.end method

.method private H()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 429
    iget v2, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->z:I

    if-nez v2, :cond_0

    .line 438
    :goto_0
    return v0

    .line 432
    :cond_0
    iput v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->z:I

    .line 18581
    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    const-string v3, "spinnerFragment"

    invoke-virtual {v2, v3}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v2

    if-eqz v2, :cond_1

    move v0, v1

    .line 435
    :cond_1
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    invoke-virtual {v0}, Lr;->e()I

    move-result v0

    if-lez v0, :cond_2

    .line 436
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    invoke-virtual {v0}, Lr;->c()V

    :cond_2
    move v0, v1

    .line 438
    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lbdf;IJLjava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 3

    .prologue
    .line 97
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 98
    const-string v1, "device"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 99
    const-string v1, "deviceIpAddress"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 100
    const-string v1, "deviceConfiguration"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 101
    const-string v1, "devicePosition"

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 102
    const-string v1, "scanStart"

    invoke-virtual {v0, v1, p5, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 103
    const-string v1, "backdropAppDeviceIdKey"

    invoke-virtual {v0, v1, p7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 104
    const-string v1, "backdropCertKey"

    invoke-virtual {v0, v1, p8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 105
    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lbdf;ZLjava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 3

    .prologue
    .line 115
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 116
    const-string v1, "device"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 117
    const-string v1, "deviceIpAddress"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 118
    const-string v1, "deviceConfiguration"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 119
    const-string v1, "launchBackdrop"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 120
    const-string v1, "backdropPersonalized"

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 121
    const-string v1, "backdropAppDeviceIdKey"

    invoke-virtual {v0, v1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 122
    const-string v1, "backdropCertKey"

    invoke-virtual {v0, v1, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 123
    return-object v0
.end method

.method private a(Lj;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 566
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    invoke-virtual {v0}, Lr;->a()Laf;

    move-result-object v0

    sget v1, Lf;->bk:I

    .line 567
    invoke-virtual {v0, v1, p1, p2}, Laf;->b(ILj;Ljava/lang/String;)Laf;

    move-result-object v0

    .line 568
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 569
    invoke-virtual {v0, p3}, Laf;->a(Ljava/lang/String;)Laf;

    .line 570
    const/16 v1, 0x1001

    invoke-virtual {v0, v1}, Laf;->a(I)Laf;

    .line 572
    :cond_0
    invoke-virtual {v0}, Laf;->b()I

    .line 573
    return-void
.end method

.method private static a(Ljava/lang/Integer;)V
    .locals 3

    .prologue
    .line 576
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    new-instance v1, Lapd;

    const/16 v2, 0x4b

    invoke-direct {v1, v2}, Lapd;-><init>(I)V

    .line 577
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    .line 576
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 578
    return-void
.end method

.method private a(Ljava/lang/String;IZ)V
    .locals 3

    .prologue
    .line 412
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    const-string v1, "spinnerFragment"

    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    .line 415
    if-nez v0, :cond_0

    .line 416
    invoke-static {p1}, Lata;->a(Ljava/lang/String;)Lj;

    move-result-object v1

    .line 417
    const-string v2, "spinnerFragment"

    if-eqz p3, :cond_1

    .line 418
    sget-object v0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->v:Ljava/lang/String;

    .line 417
    :goto_0
    invoke-direct {p0, v1, v2, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Lj;Ljava/lang/String;Ljava/lang/String;)V

    .line 420
    :cond_0
    iput p2, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->z:I

    .line 421
    return-void

    .line 418
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;)Z
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g()Z

    move-result v0

    return v0
.end method

.method public static synthetic b(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;)Lbhf;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->e:Lbhf;

    return-object v0
.end method

.method public static n()Z
    .locals 1

    .prologue
    .line 503
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 23396
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->e:Ljava/lang/String;

    .line 503
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Ldbv;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 691
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    if-eqz v0, :cond_0

    .line 692
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 34485
    iget-object v0, v0, Lash;->d:Lasb;

    .line 35137
    iget-object v1, v0, Lasb;->a:Lblp;

    const-string v2, "Updated setting based on DeviceSettingsResponse: %s"

    new-array v3, v6, [Ljava/lang/Object;

    iget-object v4, p1, Ldbv;->b:Ldck;

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Lblp;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35138
    iget-object v1, v0, Lasb;->b:Latz;

    .line 36140
    iget-object v1, v1, Latz;->a:Lauq;

    .line 35138
    iget-object v2, p1, Ldbv;->b:Ldck;

    invoke-virtual {v1, v2}, Lauq;->a(Ldck;)V

    .line 35140
    iget-object v1, v0, Lasb;->a:Lblp;

    const-string v2, "Updated metadata based on DeviceSettingsResponse: %s"

    new-array v3, v6, [Ljava/lang/Object;

    iget-object v4, p1, Ldbv;->a:Ldcj;

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Lblp;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35142
    iget-object v1, v0, Lasb;->b:Latz;

    .line 36144
    iget-object v1, v1, Latz;->b:Laur;

    .line 35142
    iget-object v2, p1, Ldbv;->a:Ldcj;

    .line 37033
    iput-object v2, v1, Laur;->b:Ldcj;

    .line 35144
    iget-object v0, v0, Lasb;->c:Lasg;

    invoke-interface {v0}, Lasg;->d_()V

    .line 694
    :cond_0
    return-void
.end method

.method public final a(Ldcj;)V
    .locals 3

    .prologue
    .line 472
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    const-string v1, "photosFragment"

    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    .line 473
    if-nez v0, :cond_0

    .line 474
    invoke-static {p1}, Lasx;->a(Ldcj;)Lasx;

    move-result-object v0

    .line 476
    :cond_0
    const-string v1, "photosFragment"

    const-string v2, "photosFragment"

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Lj;Ljava/lang/String;Ljava/lang/String;)V

    .line 477
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Ljava/lang/Integer;)V

    .line 478
    return-void
.end method

.method public final a(Ldcj;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 521
    iget-object v0, p1, Ldcj;->j:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 554
    :cond_0
    :goto_0
    return-void

    .line 526
    :cond_1
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    if-eqz v0, :cond_0

    .line 527
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 23485
    iget-object v0, v0, Lash;->d:Lasb;

    .line 24110
    iget-object v1, v0, Lasb;->b:Latz;

    .line 529
    monitor-enter v1

    .line 530
    :try_start_0
    iget-object v0, p1, Ldcj;->j:Ljava/lang/String;

    iget-object v2, p1, Ldcj;->o:Ljava/lang/String;

    .line 24134
    iput-object v0, v1, Latz;->d:Ljava/lang/String;

    .line 24135
    iput-object v2, v1, Latz;->e:Ljava/lang/String;

    .line 24136
    const-wide/16 v2, 0x0

    iput-wide v2, v1, Latz;->c:J

    .line 532
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v0

    new-instance v2, Lalx;

    invoke-direct {v2, p0, p1, p2}, Lalx;-><init>(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;Ldcj;Ljava/lang/String;)V

    .line 531
    invoke-virtual {v1, v0, v2}, Latz;->a(Latf;Lauo;)V

    .line 551
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Landroid/app/AlertDialog;Lbfs;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 293
    if-nez p2, :cond_1

    .line 327
    :cond_0
    :goto_0
    return v0

    .line 11130
    :cond_1
    iget-object v1, p2, Lbfs;->a:Ljava/lang/String;

    .line 11915
    iget-object v2, p0, Land;->i:Lbdf;

    .line 12459
    iget-object v2, v2, Lbdf;->y:Ljava/lang/String;

    .line 296
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 13162
    iget-object v1, p2, Lbfs;->e:Ljava/lang/String;

    .line 297
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 300
    :cond_2
    invoke-virtual {p0, p2}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Lbfs;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 301
    const/4 v0, 0x0

    goto :goto_0

    .line 13833
    :cond_3
    iget-object v1, p0, Land;->p:Lbdu;

    .line 304
    const/4 v2, 0x0

    new-instance v3, Lalw;

    invoke-direct {v3, p0, p2, p1}, Lalw;-><init>(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;Lbfs;Landroid/app/AlertDialog;)V

    invoke-virtual {p0, v1, v2, p2, v3}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Lbdm;Ljava/util/HashMap;Lbfs;Laop;)V

    goto :goto_0
.end method

.method public final a_(I)V
    .locals 1

    .prologue
    .line 586
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 587
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->G()V

    .line 589
    :cond_0
    return-void
.end method

.method public final b(Ldcj;)V
    .locals 3

    .prologue
    .line 508
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    const-string v1, "peoplePickerFragment"

    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    .line 509
    if-nez v0, :cond_0

    .line 510
    invoke-static {p1}, Lasu;->a(Ldcj;)Lasu;

    move-result-object v0

    .line 512
    :cond_0
    const-string v1, "peoplePickerFragment"

    const-string v2, "peoplePickerFragment"

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Lj;Ljava/lang/String;Ljava/lang/String;)V

    .line 513
    const/16 v0, 0x14

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Ljava/lang/Integer;)V

    .line 514
    return-void
.end method

.method public final b(Ldcj;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 559
    invoke-static {p1}, Larp;->a(Ldcj;)Larp;

    move-result-object v0

    const-string v1, "backdropSettingsFragment"

    invoke-direct {p0, v0, v1, p2}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Lj;Ljava/lang/String;Ljava/lang/String;)V

    .line 561
    if-eqz p1, :cond_0

    iget-object v0, p1, Ldcj;->b:Ljava/lang/Integer;

    if-nez v0, :cond_1

    .line 562
    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 561
    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Ljava/lang/Integer;)V

    .line 563
    return-void

    .line 562
    :cond_1
    iget-object v0, p1, Ldcj;->b:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 241
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->w:Lapu;

    if-eqz v0, :cond_0

    .line 8808
    iget-object v0, p0, Lm;->b:Lt;

    .line 242
    invoke-virtual {v0}, Lr;->a()Laf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->w:Lapu;

    invoke-virtual {v0, v1}, Laf;->a(Lj;)Laf;

    move-result-object v0

    invoke-virtual {v0}, Laf;->b()I

    .line 243
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->w:Lapu;

    .line 245
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->y()V

    .line 246
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 247
    invoke-virtual {p0, p1}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->e(Ljava/lang/String;)V

    .line 251
    :goto_0
    return-void

    .line 249
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->w()V

    goto :goto_0
.end method

.method public final c(Ldcj;)V
    .locals 11

    .prologue
    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 663
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    const-string v1, "backdropSettingsFragment"

    .line 664
    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Larp;

    .line 665
    if-eqz v6, :cond_b

    .line 26452
    invoke-static {}, Laku;->a()Laku;

    move-result-object v1

    iget-object v0, v6, Larp;->a:Lafm;

    new-instance v2, Larq;

    invoke-direct {v2, v6, p1}, Larq;-><init>(Larp;Ldcj;)V

    .line 27130
    instance-of v3, v0, Laik;

    if-nez v3, :cond_0

    .line 27131
    new-instance v0, Lafq;

    const-string v1, "Unexpected CallbackManager, please use the provided Factory."

    invoke-direct {v0, v1}, Lafq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 27134
    :cond_0
    check-cast v0, Laik;

    sget-object v3, Laim;->a:Laim;

    .line 27135
    invoke-virtual {v3}, Laim;->a()I

    move-result v3

    new-instance v4, Lakv;

    invoke-direct {v4, v1, v2}, Lakv;-><init>(Laku;Lafo;)V

    .line 28074
    const-string v1, "callback"

    invoke-static {v4, v1}, Lajp;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28075
    iget-object v0, v0, Laik;->a:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26485
    invoke-static {}, Laku;->a()Laku;

    move-result-object v10

    invoke-static {p1}, Larp;->b(Ldcj;)Ljava/util/List;

    move-result-object v3

    .line 28293
    if-eqz v3, :cond_2

    .line 28296
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 28297
    invoke-static {v0}, Laku;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 28298
    new-instance v1, Lafq;

    const-string v2, "Cannot pass a publish or manage permission (%s) to a request for read authorization"

    new-array v3, v7, [Ljava/lang/Object;

    aput-object v0, v3, v8

    .line 28299
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lafq;-><init>(Ljava/lang/String;)V

    throw v1

    .line 28338
    :cond_2
    new-instance v0, Lakl;

    iget-object v1, v10, Laku;->a:Lakg;

    if-eqz v3, :cond_6

    .line 28341
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 28340
    :goto_0
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    iget-object v3, v10, Laku;->b:Lajy;

    .line 28343
    invoke-static {}, Lafv;->h()Ljava/lang/String;

    move-result-object v4

    .line 28344
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lakl;-><init>(Lakg;Ljava/util/Set;Lajy;Ljava/lang/String;Ljava/lang/String;)V

    .line 28346
    invoke-static {}, Lafb;->a()Lafb;

    move-result-object v1

    if-eqz v1, :cond_7

    move v1, v7

    .line 28478
    :goto_1
    iput-boolean v1, v0, Lakl;->f:Z

    .line 28249
    new-instance v2, Lala;

    invoke-direct {v2, v6}, Lala;-><init>(Lj;)V

    .line 29355
    iput-object v0, v10, Laku;->c:Lakl;

    .line 29356
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v10, Laku;->d:Ljava/util/HashMap;

    .line 29357
    invoke-virtual {v2}, Lala;->a()Landroid/app/Activity;

    move-result-object v3

    .line 29391
    if-eqz v3, :cond_3

    iget-object v1, v10, Laku;->c:Lakl;

    if-nez v1, :cond_8

    :cond_3
    move-object v1, v9

    .line 29357
    :cond_4
    :goto_2
    iput-object v1, v10, Laku;->e:Lakt;

    .line 32404
    iget-object v1, v10, Laku;->e:Lakt;

    if-eqz v1, :cond_5

    iget-object v1, v10, Laku;->c:Lakl;

    if-eqz v1, :cond_5

    .line 32405
    iget-object v1, v10, Laku;->e:Lakt;

    iget-object v3, v10, Laku;->c:Lakl;

    invoke-virtual {v1, v3}, Lakt;->a(Lakl;)V

    .line 29362
    :cond_5
    sget-object v1, Laim;->a:Laim;

    .line 29363
    invoke-virtual {v1}, Laim;->a()I

    move-result v1

    new-instance v3, Lakx;

    invoke-direct {v3, v10}, Lakx;-><init>(Laku;)V

    .line 29362
    invoke-static {v1, v3}, Laik;->a(ILail;)V

    .line 29372
    invoke-virtual {v10, v2, v0}, Laku;->a(Lala;Lakl;)Z

    move-result v1

    .line 29374
    iget-object v2, v10, Laku;->d:Ljava/util/HashMap;

    const-string v3, "try_login_activity"

    if-eqz v1, :cond_a

    .line 29377
    const-string v0, "1"

    .line 29374
    :goto_3
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29380
    if-nez v1, :cond_b

    .line 29381
    new-instance v0, Lafq;

    const-string v1, "Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest."

    invoke-direct {v0, v1}, Lafq;-><init>(Ljava/lang/String;)V

    .line 29384
    sget-object v1, Lakp;->c:Lakp;

    invoke-virtual {v10, v1, v9, v0}, Laku;->a(Lakp;Ljava/util/Map;Ljava/lang/Exception;)V

    .line 29385
    iput-object v9, v10, Laku;->c:Lakl;

    .line 29386
    throw v0

    .line 28341
    :cond_6
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    goto :goto_0

    :cond_7
    move v1, v8

    .line 28346
    goto :goto_1

    .line 29395
    :cond_8
    iget-object v1, v10, Laku;->e:Lakt;

    .line 29396
    if-eqz v1, :cond_9

    .line 30071
    iget-object v4, v1, Lakt;->b:Ljava/lang/String;

    .line 29397
    iget-object v5, v10, Laku;->c:Lakl;

    .line 30466
    iget-object v5, v5, Lakl;->d:Ljava/lang/String;

    .line 29397
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 29398
    :cond_9
    new-instance v1, Lakt;

    iget-object v4, v10, Laku;->c:Lakl;

    .line 31466
    iget-object v4, v4, Lakl;->d:Ljava/lang/String;

    .line 29398
    invoke-direct {v1, v3, v4}, Lakt;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2

    .line 29377
    :cond_a
    const-string v0, "0"

    goto :goto_3

    .line 668
    :cond_b
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 491
    .line 23077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 491
    invoke-virtual {v0, p1}, Lmj;->a(Ljava/lang/CharSequence;)V

    .line 492
    return-void
.end method

.method public final d(Ldcj;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 672
    iget-object v1, p1, Ldcj;->l:Ljava/lang/String;

    .line 673
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 674
    new-array v0, v5, [Ljava/lang/Object;

    .line 32896
    iget-object v1, p0, Land;->i:Lbdf;

    .line 33254
    iget-object v1, v1, Lbdf;->b:Ljava/lang/String;

    .line 674
    aput-object v1, v0, v4

    .line 686
    :goto_0
    return-void

    .line 677
    :cond_0
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    const-string v2, "oAuthFragment"

    invoke-virtual {v0, v2}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    .line 678
    if-nez v0, :cond_1

    .line 681
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->f:Ljava/lang/String;

    iget-object v2, p1, Ldcj;->j:Ljava/lang/String;

    const-string v3, "https://clients3.google.com"

    invoke-static {v0, v1, v2, v3}, Lbbx;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbbx;

    move-result-object v0

    .line 684
    :cond_1
    const-string v2, "oAuthFragment"

    const-string v3, "oAuthFragment"

    invoke-direct {p0, v0, v2, v3}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Lj;Ljava/lang/String;Ljava/lang/String;)V

    .line 685
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 33896
    iget-object v2, p0, Land;->i:Lbdf;

    .line 34254
    iget-object v2, v2, Lbdf;->b:Ljava/lang/String;

    .line 685
    aput-object v2, v0, v4

    aput-object v1, v0, v5

    goto :goto_0
.end method

.method public final d(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 630
    invoke-static {p0}, Lblf;->z(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 631
    new-instance v0, Laup;

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->f:Ljava/lang/String;

    new-instance v4, Laly;

    invoke-direct {v4, p0, p1}, Laly;-><init>(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;Ljava/lang/String;)V

    new-instance v5, Lalz;

    invoke-direct {v5, p0}, Lalz;-><init>(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;)V

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Laup;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Laea;Ladz;)V

    .line 658
    invoke-static {p0}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v1

    invoke-virtual {v1, v0}, Latf;->a(Lads;)V

    .line 659
    return-void
.end method

.method public final e()Landroid/content/Intent;
    .locals 2

    .prologue
    .line 616
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    const-string v1, "backdropSettingsFragment"

    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 618
    invoke-static {p0}, Lblf;->P(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/apps/chromecast/app/HelpActivity;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 620
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0}, Land;->e()Landroid/content/Intent;

    move-result-object v0

    goto :goto_0
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 331
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->e:Lbhf;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->e:Lbhf;

    .line 14741
    iget-boolean v0, v0, Lj;->s:Z

    .line 331
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final h()Lash;
    .locals 1

    .prologue
    .line 352
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    return-object v0
.end method

.method public final i()V
    .locals 2

    .prologue
    .line 371
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->H()Z

    .line 372
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    const-string v1, "backdropSettingsFragment"

    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    if-nez v0, :cond_0

    .line 17352
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 373
    invoke-virtual {v0}, Lash;->t()Laur;

    move-result-object v0

    .line 18037
    iget-object v1, v0, Laur;->b:Ldcj;

    .line 373
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->y:Z

    if-eqz v0, :cond_1

    .line 374
    const/4 v0, 0x0

    .line 373
    :goto_0
    invoke-virtual {p0, v1, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->b(Ldcj;Ljava/lang/String;)V

    .line 376
    :cond_0
    return-void

    .line 374
    :cond_1
    sget-object v0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->v:Ljava/lang/String;

    goto :goto_0
.end method

.method public final j()V
    .locals 1

    .prologue
    .line 380
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->y:Z

    if-eqz v0, :cond_0

    .line 381
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->finish()V

    .line 385
    :goto_0
    return-void

    .line 383
    :cond_0
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->H()Z

    goto :goto_0
.end method

.method public final k()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 389
    sget v0, Lb;->T:I

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 390
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->y:Z

    if-eqz v0, :cond_0

    .line 391
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->finish()V

    .line 398
    :goto_0
    return-void

    .line 393
    :cond_0
    iput v1, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->z:I

    .line 395
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    const-string v1, "backdropSettingsFragment"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lr;->b(Ljava/lang/String;I)Z

    goto :goto_0
.end method

.method public final l()V
    .locals 0

    .prologue
    .line 403
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->H()Z

    .line 404
    return-void
.end method

.method public final m()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 443
    invoke-static {}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->n()Z

    move-result v0

    if-nez v0, :cond_0

    .line 19496
    new-array v0, v5, [Ljava/lang/String;

    const-string v1, "com.google"

    aput-object v1, v0, v4

    .line 22000
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "com.google.android.gms.common.account.CHOOSE_ACCOUNT"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "com.google.android.gms"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "allowableAccounts"

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string v2, "allowableAccountTypes"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "addAccountOptions"

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    const-string v0, "selectedAccount"

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v0, "alwaysPromptForAccount"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v0, "descriptionTextOverride"

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "authTokenType"

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "addAccountRequiredFeatures"

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "setGmsCoreAccount"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v0, "overrideTheme"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "overrideCustomTheme"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 19496
    invoke-virtual {p0, v1, v5}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 451
    :goto_0
    return-void

    .line 448
    :cond_0
    invoke-static {}, Laqy;->p()Laqy;

    move-result-object v0

    .line 22073
    iput-object p0, v0, Laqy;->Z:Larc;

    .line 22808
    iget-object v1, p0, Lm;->b:Lt;

    .line 450
    const-string v2, "backdropOptInFragment"

    invoke-virtual {v0, v1, v2}, Laqy;->a(Lr;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final o()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 593
    sget v0, Lb;->R:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Laqx;->a:I

    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->y:Z

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    invoke-direct {p0, v2, v3, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Ljava/lang/String;IZ)V

    .line 24352
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 25302
    iget-object v2, v0, Lash;->Z:Ldbt;

    invoke-virtual {v0, v1, v2, p0}, Lash;->a(ILdbt;Lasp;)V

    .line 598
    return-void

    .line 593
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    .line 455
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 458
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 459
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/accounts/AccountManager;->getAccounts()[Landroid/accounts/Account;

    move-result-object v0

    .line 460
    array-length v1, v0

    if-lez v1, :cond_0

    .line 461
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v0, v0, v2

    iget-object v0, v0, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a(Ljava/lang/String;)V

    .line 462
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->m()V

    .line 468
    :cond_0
    :goto_0
    return-void

    .line 466
    :cond_1
    invoke-super {p0, p1, p2, p3}, Land;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 255
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->e:Lbhf;

    .line 9517
    iget-object v2, v2, Lbhf;->b:Landroid/widget/ViewFlipper;

    invoke-virtual {v2}, Landroid/widget/ViewFlipper;->getDisplayedChild()I

    move-result v2

    if-ne v2, v0, :cond_0

    .line 255
    :goto_0
    if-eqz v0, :cond_1

    .line 256
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->e:Lbhf;

    .line 10513
    invoke-virtual {v0, v1}, Lbhf;->b(I)V

    .line 260
    :goto_1
    return-void

    :cond_0
    move v0, v1

    .line 9517
    goto :goto_0

    .line 258
    :cond_1
    invoke-super {p0}, Land;->onBackPressed()V

    goto :goto_1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v1, 0x0

    .line 128
    invoke-super {p0, p1}, Land;->onCreate(Landroid/os/Bundle;)V

    .line 129
    sget v0, La;->fT:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->setContentView(I)V

    .line 130
    invoke-static {p0}, Lblx;->g(Landroid/app/Activity;)V

    .line 132
    sget v0, Lf;->eo:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    .line 133
    invoke-virtual {p0, p1}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Landroid/os/Bundle;)V

    .line 134
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "backdropAppDeviceIdKey"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->f:Ljava/lang/String;

    .line 135
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 136
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "launchBackdrop"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->y:Z

    .line 139
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 180
    :cond_0
    :goto_1
    return-void

    :cond_1
    move v0, v1

    .line 136
    goto :goto_0

    .line 2808
    :cond_2
    iget-object v0, p0, Lm;->b:Lt;

    .line 142
    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    .line 3808
    iget-object v0, p0, Lm;->b:Lt;

    .line 144
    const-string v2, "offersChecker"

    invoke-virtual {v0, v2}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    check-cast v0, Lapu;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->w:Lapu;

    .line 145
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    const-string v2, "deviceSettingsFragment"

    invoke-virtual {v0, v2}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    check-cast v0, Lbhf;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->e:Lbhf;

    .line 147
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    const-string v2, "backdropOptInFragment"

    .line 148
    invoke-virtual {v0, v2}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    check-cast v0, Laqy;

    .line 149
    if-eqz v0, :cond_3

    .line 4073
    iput-object p0, v0, Laqy;->Z:Larc;

    .line 152
    :cond_3
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    const-string v2, "backdropStorage"

    invoke-virtual {v0, v2}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    check-cast v0, Lash;

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 153
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->s()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 154
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "backdropCertKey"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 155
    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->f:Ljava/lang/String;

    .line 4896
    iget-object v3, p0, Land;->i:Lbdf;

    .line 5254
    iget-object v3, v3, Lbdf;->b:Ljava/lang/String;

    .line 5915
    iget-object v4, p0, Land;->i:Lbdf;

    .line 6306
    iget-object v4, v4, Lbdf;->g:Ljava/lang/String;

    .line 155
    invoke-static {v2, v3, v4, v0}, Lash;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lash;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 157
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    invoke-virtual {v0}, Lr;->a()Laf;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    const-string v3, "backdropStorage"

    invoke-virtual {v0, v2, v3}, Laf;->a(Lj;Ljava/lang/String;)Laf;

    move-result-object v0

    invoke-virtual {v0}, Laf;->b()I

    .line 162
    :cond_4
    if-nez p1, :cond_0

    .line 163
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->y:Z

    if-eqz v0, :cond_6

    .line 166
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "backdropPersonalized"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 167
    invoke-virtual {p0, v5, v5}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->b(Ldcj;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 169
    :cond_5
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->m()V

    goto/16 :goto_1

    .line 6335
    :cond_6
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->e:Lbhf;

    if-nez v0, :cond_7

    .line 6336
    new-instance v0, Lbhf;

    invoke-direct {v0}, Lbhf;-><init>()V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->e:Lbhf;

    .line 6340
    :cond_7
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x:Lr;

    invoke-virtual {v0}, Lr;->a()Laf;

    move-result-object v0

    sget v1, Lf;->bk:I

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->e:Lbhf;

    const-string v3, "deviceSettingsFragment"

    invoke-virtual {v0, v1, v2, v3}, Laf;->a(ILj;Ljava/lang/String;)Laf;

    move-result-object v0

    .line 6342
    invoke-virtual {v0}, Laf;->b()I

    .line 173
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "devicePosition"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 174
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "scanStart"

    const-wide/16 v4, 0x0

    invoke-virtual {v1, v2, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    .line 175
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    const/16 v4, 0x23

    .line 177
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 175
    invoke-virtual {v1, v4, v0, v2}, Lape;->a(ILjava/lang/Integer;Ljava/lang/Long;)V

    goto/16 :goto_1
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 184
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, La;->gY:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 185
    const/4 v0, 0x1

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .prologue
    .line 200
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lf;->bK:I

    if-ne v0, v1, :cond_1

    .line 201
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->w:Lapu;

    if-nez v0, :cond_0

    .line 202
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x()V

    .line 6892
    iget-object v0, p0, Land;->j:Ljava/lang/String;

    .line 6915
    iget-object v1, p0, Land;->i:Lbdf;

    .line 7708
    iget-boolean v1, v1, Lbdf;->Q:Z

    .line 203
    invoke-static {v0, v1}, Lapu;->a(Ljava/lang/String;Z)Lapu;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->w:Lapu;

    .line 7808
    iget-object v0, p0, Lm;->b:Lt;

    .line 206
    invoke-virtual {v0}, Lr;->a()Laf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->w:Lapu;

    const-string v2, "offersChecker"

    invoke-virtual {v0, v1, v2}, Laf;->a(Lj;Ljava/lang/String;)Laf;

    move-result-object v0

    invoke-virtual {v0}, Laf;->b()I

    .line 214
    :cond_0
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0

    .line 208
    :cond_1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_2

    .line 210
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->onBackPressed()V

    goto :goto_0

    .line 7833
    :cond_2
    iget-object v0, p0, Land;->p:Lbdu;

    .line 212
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->f:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Landroid/view/MenuItem;Lbdm;Ljava/lang/String;)Z

    move-result v0

    goto :goto_1
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 190
    invoke-super {p0, p1}, Land;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    .line 192
    invoke-static {p0}, Lblf;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->s:Landroid/widget/ViewFlipper;

    .line 193
    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getDisplayedChild()I

    move-result v0

    if-eq v0, v1, :cond_0

    move v0, v1

    .line 194
    :goto_0
    sget v2, Lf;->bK:I

    invoke-static {p1, v2, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Landroid/view/Menu;IZ)V

    .line 195
    return v1

    .line 193
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onResume()V
    .locals 0

    .prologue
    .line 227
    invoke-super {p0}, Land;->onResume()V

    .line 228
    invoke-direct {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->G()V

    .line 229
    return-void
.end method

.method public onStart()V
    .locals 1

    .prologue
    .line 219
    invoke-super {p0}, Land;->onStart()V

    .line 220
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    invoke-virtual {v0, p0}, Lash;->a(Lasq;)V

    .line 223
    :cond_0
    return-void
.end method

.method public onStop()V
    .locals 1

    .prologue
    .line 233
    invoke-super {p0}, Land;->onStop()V

    .line 234
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    if-eqz v0, :cond_0

    .line 235
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    invoke-virtual {v0, p0}, Lash;->b(Lasq;)V

    .line 237
    :cond_0
    return-void
.end method

.method public final p()V
    .locals 1

    .prologue
    .line 602
    iget-boolean v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->y:Z

    if-eqz v0, :cond_0

    .line 603
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->finish()V

    .line 605
    :cond_0
    return-void
.end method

.method public final q()V
    .locals 3

    .prologue
    .line 609
    sget v0, Lb;->U:I

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Laqx;->b:I

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Ljava/lang/String;IZ)V

    .line 25352
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 26310
    const/4 v1, 0x2

    iget-object v2, v0, Lash;->Z:Ldbt;

    invoke-virtual {v0, v1, v2, p0}, Lash;->a(ILdbt;Lasp;)V

    .line 612
    return-void
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    .prologue
    .line 625
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final s()Z
    .locals 1

    .prologue
    .line 700
    .line 37625
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->f:Ljava/lang/String;

    .line 700
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 37915
    iget-object v0, p0, Land;->i:Lbdf;

    .line 38314
    iget-boolean v0, v0, Lbdf;->h:Z

    .line 701
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

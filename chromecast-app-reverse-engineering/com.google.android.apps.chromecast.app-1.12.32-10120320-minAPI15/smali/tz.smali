.class public final Ltz;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field public static a:Luc;

.field private static final d:Z


# instance fields
.field final b:Landroid/content/Context;

.field final c:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 72
    const-string v0, "MediaRouter"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Ltz;->d:Z

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ltz;->c:Ljava/util/ArrayList;

    .line 219
    iput-object p1, p0, Ltz;->b:Landroid/content/Context;

    .line 220
    return-void
.end method

.method public static a()Ljava/util/List;
    .locals 1

    .prologue
    .line 257
    invoke-static {}, Ltz;->f()V

    .line 258
    sget-object v0, Ltz;->a:Luc;

    .line 3724
    iget-object v0, v0, Luc;->c:Ljava/util/ArrayList;

    .line 258
    return-object v0
.end method

.method public static a(Landroid/content/Context;)Ltz;
    .locals 6

    .prologue
    .line 240
    if-nez p0, :cond_0

    .line 241
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "context must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 243
    :cond_0
    invoke-static {}, Ltz;->f()V

    .line 245
    sget-object v0, Ltz;->a:Luc;

    if-nez v0, :cond_1

    .line 246
    new-instance v0, Luc;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Luc;-><init>(Landroid/content/Context;)V

    .line 247
    sput-object v0, Ltz;->a:Luc;

    .line 2659
    new-instance v1, Luz;

    iget-object v2, v0, Luc;->a:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Luz;-><init>(Landroid/content/Context;Lvc;)V

    iput-object v1, v0, Luc;->f:Luz;

    .line 2661
    iget-object v0, v0, Luc;->f:Luz;

    .line 3056
    iget-boolean v1, v0, Luz;->c:Z

    if-nez v1, :cond_1

    .line 3057
    const/4 v1, 0x1

    iput-boolean v1, v0, Luz;->c:Z

    .line 3059
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 3060
    const-string v2, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 3061
    const-string v2, "android.intent.action.PACKAGE_REMOVED"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 3062
    const-string v2, "android.intent.action.PACKAGE_CHANGED"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 3063
    const-string v2, "android.intent.action.PACKAGE_REPLACED"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 3064
    const-string v2, "android.intent.action.PACKAGE_RESTARTED"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 3065
    const-string v2, "package"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 3066
    iget-object v2, v0, Luz;->a:Landroid/content/Context;

    iget-object v3, v0, Luz;->d:Landroid/content/BroadcastReceiver;

    const/4 v4, 0x0

    iget-object v5, v0, Luz;->b:Landroid/os/Handler;

    invoke-virtual {v2, v3, v1, v4, v5}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 3070
    iget-object v1, v0, Luz;->b:Landroid/os/Handler;

    iget-object v0, v0, Luz;->e:Ljava/lang/Runnable;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 249
    :cond_1
    sget-object v0, Ltz;->a:Luc;

    invoke-virtual {v0, p0}, Luc;->a(Landroid/content/Context;)Ltz;

    move-result-object v0

    return-object v0
.end method

.method public static a(Luh;)V
    .locals 2

    .prologue
    .line 371
    if-nez p0, :cond_0

    .line 372
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "route must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 374
    :cond_0
    invoke-static {}, Ltz;->f()V

    .line 376
    sget-boolean v0, Ltz;->d:Z

    if-eqz v0, :cond_1

    .line 377
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "selectRoute: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 379
    :cond_1
    sget-object v0, Ltz;->a:Luc;

    .line 3754
    const/4 v1, 0x3

    invoke-virtual {v0, p0, v1}, Luc;->a(Luh;I)V

    .line 380
    return-void
.end method

.method static a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 754
    if-eq p0, p1, :cond_0

    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Ltx;I)Z
    .locals 2

    .prologue
    .line 428
    if-nez p0, :cond_0

    .line 429
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "selector must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 431
    :cond_0
    invoke-static {}, Ltz;->f()V

    .line 433
    sget-object v0, Ltz;->a:Luc;

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Luc;->a(Ltx;I)Z

    move-result v0

    return v0
.end method

.method private b(Lua;)I
    .locals 3

    .prologue
    .line 610
    iget-object v0, p0, Ltz;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 611
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 612
    iget-object v0, p0, Ltz;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lub;

    iget-object v0, v0, Lub;->b:Lua;

    if-ne v0, p1, :cond_0

    move v0, v1

    .line 616
    :goto_1
    return v0

    .line 611
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 616
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public static b()Ljava/util/List;
    .locals 1

    .prologue
    .line 266
    invoke-static {}, Ltz;->f()V

    .line 267
    sget-object v0, Ltz;->a:Luc;

    .line 3728
    iget-object v0, v0, Luc;->d:Ljava/util/ArrayList;

    .line 267
    return-object v0
.end method

.method public static c()Luh;
    .locals 1

    .prologue
    .line 280
    invoke-static {}, Ltz;->f()V

    .line 281
    sget-object v0, Ltz;->a:Luc;

    invoke-virtual {v0}, Luc;->a()Luh;

    move-result-object v0

    return-object v0
.end method

.method public static d()Luh;
    .locals 1

    .prologue
    .line 331
    invoke-static {}, Ltz;->f()V

    .line 332
    sget-object v0, Ltz;->a:Luc;

    invoke-virtual {v0}, Luc;->b()Luh;

    move-result-object v0

    return-object v0
.end method

.method public static e()Ldm;
    .locals 1

    .prologue
    .line 739
    sget-object v0, Ltz;->a:Luc;

    .line 4223
    const/4 v0, 0x0

    .line 739
    return-object v0
.end method

.method public static f()V
    .locals 2

    .prologue
    .line 747
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 748
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The media router service must only be accessed on the application\'s main thread."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 751
    :cond_0
    return-void
.end method

.method static synthetic g()Z
    .locals 1

    .prologue
    .line 70
    sget-boolean v0, Ltz;->d:Z

    return v0
.end method


# virtual methods
.method public final a(Ltx;Lua;I)V
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 548
    if-nez p1, :cond_0

    .line 549
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "selector must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 551
    :cond_0
    if-nez p2, :cond_1

    .line 552
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "callback must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 554
    :cond_1
    invoke-static {}, Ltz;->f()V

    .line 556
    sget-boolean v0, Ltz;->d:Z

    if-eqz v0, :cond_2

    .line 557
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "addCallback: selector="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", callback="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", flags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    :cond_2
    invoke-direct {p0, p2}, Ltz;->b(Lua;)I

    move-result v0

    .line 563
    if-gez v0, :cond_5

    .line 564
    new-instance v0, Lub;

    invoke-direct {v0, p0, p2}, Lub;-><init>(Ltz;Lua;)V

    .line 565
    iget-object v1, p0, Ltz;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 570
    :goto_0
    iget v1, v0, Lub;->d:I

    xor-int/lit8 v1, v1, -0x1

    and-int/2addr v1, p3

    if-eqz v1, :cond_7

    .line 571
    iget v1, v0, Lub;->d:I

    or-int/2addr v1, p3

    iput v1, v0, Lub;->d:I

    move v1, v2

    .line 574
    :goto_1
    iget-object v4, v0, Lub;->c:Ltx;

    .line 4136
    if-eqz p1, :cond_3

    .line 4137
    invoke-virtual {v4}, Ltx;->b()V

    .line 4138
    invoke-virtual {p1}, Ltx;->b()V

    .line 4139
    iget-object v3, v4, Ltx;->b:Ljava/util/List;

    iget-object v4, p1, Ltx;->b:Ljava/util/List;

    invoke-interface {v3, v4}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v3

    .line 574
    :cond_3
    if-nez v3, :cond_6

    .line 575
    new-instance v1, Lty;

    iget-object v3, v0, Lub;->c:Ltx;

    invoke-direct {v1, v3}, Lty;-><init>(Ltx;)V

    invoke-virtual {v1, p1}, Lty;->a(Ltx;)Lty;

    move-result-object v1

    invoke-virtual {v1}, Lty;->a()Ltx;

    move-result-object v1

    iput-object v1, v0, Lub;->c:Ltx;

    .line 580
    :goto_2
    if-eqz v2, :cond_4

    .line 581
    sget-object v0, Ltz;->a:Luc;

    invoke-virtual {v0}, Luc;->c()V

    .line 583
    :cond_4
    return-void

    .line 567
    :cond_5
    iget-object v1, p0, Ltz;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lub;

    goto :goto_0

    :cond_6
    move v2, v1

    goto :goto_2

    :cond_7
    move v1, v3

    goto :goto_1
.end method

.method public final a(Lua;)V
    .locals 2

    .prologue
    .line 593
    if-nez p1, :cond_0

    .line 594
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "callback must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 596
    :cond_0
    invoke-static {}, Ltz;->f()V

    .line 598
    sget-boolean v0, Ltz;->d:Z

    if-eqz v0, :cond_1

    .line 599
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "removeCallback: callback="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 602
    :cond_1
    invoke-direct {p0, p1}, Ltz;->b(Lua;)I

    move-result v0

    .line 603
    if-ltz v0, :cond_2

    .line 604
    iget-object v1, p0, Ltz;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 605
    sget-object v0, Ltz;->a:Luc;

    invoke-virtual {v0}, Luc;->c()V

    .line 607
    :cond_2
    return-void
.end method

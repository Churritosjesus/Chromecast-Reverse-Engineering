.class public final Loa;
.super Lua;
.source "PG"


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroid/support/v7/app/MediaRouteActionProvider;)V
    .locals 1

    .prologue
    .line 289
    invoke-direct {p0}, Lua;-><init>()V

    .line 290
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Loa;->a:Ljava/lang/ref/WeakReference;

    .line 291
    return-void
.end method

.method private d(Ltz;)V
    .locals 1

    .prologue
    .line 324
    iget-object v0, p0, Loa;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/app/MediaRouteActionProvider;

    .line 325
    if-eqz v0, :cond_0

    .line 326
    invoke-static {v0}, Landroid/support/v7/app/MediaRouteActionProvider;->a(Landroid/support/v7/app/MediaRouteActionProvider;)V

    .line 330
    :goto_0
    return-void

    .line 328
    :cond_0
    invoke-virtual {p1, p0}, Ltz;->a(Lua;)V

    goto :goto_0
.end method


# virtual methods
.method public final a(Ltz;)V
    .locals 0

    .prologue
    .line 310
    invoke-direct {p0, p1}, Loa;->d(Ltz;)V

    .line 311
    return-void
.end method

.method public final a(Ltz;Luh;)V
    .locals 0

    .prologue
    .line 295
    invoke-direct {p0, p1}, Loa;->d(Ltz;)V

    .line 296
    return-void
.end method

.method public final b(Ltz;)V
    .locals 0

    .prologue
    .line 315
    invoke-direct {p0, p1}, Loa;->d(Ltz;)V

    .line 316
    return-void
.end method

.method public final b(Ltz;Luh;)V
    .locals 0

    .prologue
    .line 300
    invoke-direct {p0, p1}, Loa;->d(Ltz;)V

    .line 301
    return-void
.end method

.method public final c(Ltz;)V
    .locals 0

    .prologue
    .line 320
    invoke-direct {p0, p1}, Loa;->d(Ltz;)V

    .line 321
    return-void
.end method

.method public final c(Ltz;Luh;)V
    .locals 0

    .prologue
    .line 305
    invoke-direct {p0, p1}, Loa;->d(Ltz;)V

    .line 306
    return-void
.end method

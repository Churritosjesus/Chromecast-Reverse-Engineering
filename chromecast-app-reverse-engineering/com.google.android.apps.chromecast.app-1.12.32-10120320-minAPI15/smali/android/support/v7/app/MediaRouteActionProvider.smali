.class public Landroid/support/v7/app/MediaRouteActionProvider;
.super Lfb;
.source "PG"


# instance fields
.field public c:Lob;

.field private final d:Ltz;

.field private e:Ltx;

.field private f:Lop;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 144
    invoke-direct {p0, p1}, Lfb;-><init>(Landroid/content/Context;)V

    .line 134
    sget-object v0, Ltx;->c:Ltx;

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->e:Ltx;

    .line 135
    invoke-static {}, Lop;->a()Lop;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->f:Lop;

    .line 146
    invoke-static {p1}, Ltz;->a(Landroid/content/Context;)Ltz;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->d:Ltz;

    .line 147
    new-instance v0, Loa;

    invoke-direct {v0, p0}, Loa;-><init>(Landroid/support/v7/app/MediaRouteActionProvider;)V

    .line 148
    return-void
.end method

.method public static synthetic a(Landroid/support/v7/app/MediaRouteActionProvider;)V
    .locals 0

    .prologue
    .line 128
    .line 4283
    invoke-virtual {p0}, Landroid/support/v7/app/MediaRouteActionProvider;->d()V

    .line 128
    return-void
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 5

    .prologue
    .line 247
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->c:Lob;

    if-eqz v0, :cond_0

    .line 248
    const-string v0, "MediaRouteActionProvider"

    const-string v1, "onCreateActionView: this ActionProvider is already associated with a menu item. Don\'t reuse MediaRouteActionProvider instances! Abandoning the old menu item..."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1241
    :cond_0
    new-instance v0, Lob;

    .line 2086
    iget-object v1, p0, Lfb;->a:Landroid/content/Context;

    .line 1241
    invoke-direct {v0, v1}, Lob;-><init>(Landroid/content/Context;)V

    .line 253
    iput-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->c:Lob;

    .line 254
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->c:Lob;

    .line 2278
    const/4 v1, 0x1

    iput-boolean v1, v0, Lob;->e:Z

    .line 255
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->c:Lob;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteActionProvider;->e:Ltx;

    .line 3160
    if-nez v1, :cond_1

    .line 3161
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "selector must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3164
    :cond_1
    iget-object v2, v0, Lob;->c:Ltx;

    invoke-virtual {v2, v1}, Ltx;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 3165
    iget-boolean v2, v0, Lob;->d:Z

    if-eqz v2, :cond_3

    .line 3166
    iget-object v2, v0, Lob;->c:Ltx;

    invoke-virtual {v2}, Ltx;->c()Z

    move-result v2

    if-nez v2, :cond_2

    .line 3167
    iget-object v2, v0, Lob;->a:Ltz;

    iget-object v3, v0, Lob;->b:Loc;

    invoke-virtual {v2, v3}, Ltz;->a(Lua;)V

    .line 3169
    :cond_2
    invoke-virtual {v1}, Ltx;->c()Z

    move-result v2

    if-nez v2, :cond_3

    .line 3170
    iget-object v2, v0, Lob;->a:Ltz;

    iget-object v3, v0, Lob;->b:Loc;

    .line 3450
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v3, v4}, Ltz;->a(Ltx;Lua;I)V

    .line 3173
    :cond_3
    iput-object v1, v0, Lob;->c:Ltx;

    .line 3174
    invoke-virtual {v0}, Lob;->b()V

    .line 256
    :cond_4
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->c:Lob;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteActionProvider;->f:Lop;

    invoke-virtual {v0, v1}, Lob;->a(Lop;)V

    .line 257
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->c:Lob;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x2

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lob;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 260
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->c:Lob;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 273
    const/4 v0, 0x1

    return v0
.end method

.method public final c()Z
    .locals 2

    .prologue
    .line 278
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->e:Ltx;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ltz;->a(Ltx;I)Z

    move-result v0

    return v0
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 265
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->c:Lob;

    if-eqz v0, :cond_0

    .line 266
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteActionProvider;->c:Lob;

    invoke-virtual {v0}, Lob;->a()Z

    move-result v0

    .line 268
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

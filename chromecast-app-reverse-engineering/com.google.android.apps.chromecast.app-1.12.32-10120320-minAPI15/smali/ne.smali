.class public final Lne;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Lmz;

.field public b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 269
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lnd;->a(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lne;-><init>(Landroid/content/Context;I)V

    .line 270
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .prologue
    .line 279
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 280
    new-instance v0, Lmz;

    new-instance v1, Landroid/view/ContextThemeWrapper;

    invoke-static {p1, p2}, Lnd;->a(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Lmz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lne;->a:Lmz;

    .line 282
    iput p2, p0, Lne;->b:I

    .line 283
    return-void
.end method

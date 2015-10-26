.class final Lub;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Ltz;

.field public final b:Lua;

.field public c:Ltx;

.field public d:I


# direct methods
.method public constructor <init>(Ltz;Lua;)V
    .locals 1

    .prologue
    .line 1582
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1583
    iput-object p1, p0, Lub;->a:Ltz;

    .line 1584
    iput-object p2, p0, Lub;->b:Lua;

    .line 1585
    sget-object v0, Ltx;->c:Ltx;

    iput-object v0, p0, Lub;->c:Ltx;

    .line 1586
    return-void
.end method

.class final Laxu;
.super Lzj;
.source "PG"


# direct methods
.method constructor <init>(Laxq;)V
    .locals 0

    .prologue
    .line 351
    invoke-direct {p0}, Lzj;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .prologue
    .line 354
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 355
    const/16 v0, 0x8d

    invoke-static {v0}, Lapg;->a(I)Lapg;

    move-result-object v0

    invoke-virtual {v0}, Lapg;->b()V

    .line 357
    :cond_0
    return-void
.end method

.class final Lays;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lazr;


# instance fields
.field private synthetic a:Layq;


# direct methods
.method constructor <init>(Layq;)V
    .locals 0

    .prologue
    .line 167
    iput-object p1, p0, Lays;->a:Layq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 175
    iget-object v0, p0, Lays;->a:Layq;

    invoke-static {v0}, Layq;->b(Layq;)V

    .line 176
    iget-object v0, p0, Lays;->a:Layq;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Layq;->a(Layq;I)V

    .line 177
    return-void
.end method

.method public final a(Lazu;)V
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lays;->a:Layq;

    invoke-static {v0, p1}, Layq;->a(Layq;Lazu;)V

    .line 171
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Lays;->a:Layq;

    invoke-static {v0}, Layq;->b(Layq;)V

    .line 182
    return-void
.end method

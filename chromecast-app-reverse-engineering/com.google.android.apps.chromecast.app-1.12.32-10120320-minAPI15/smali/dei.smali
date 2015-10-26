.class final Ldei;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lddm;


# instance fields
.field private final a:Ldeh;

.field private b:Lddm;

.field private c:I


# direct methods
.method constructor <init>(Ldeg;)V
    .locals 1

    .prologue
    .line 774
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 775
    new-instance v0, Ldeh;

    .line 1688
    invoke-direct {v0, p1}, Ldeh;-><init>(Lddl;)V

    .line 775
    iput-object v0, p0, Ldei;->a:Ldeh;

    .line 776
    iget-object v0, p0, Ldei;->a:Ldeh;

    invoke-virtual {v0}, Ldeh;->a()Lddy;

    move-result-object v0

    invoke-virtual {v0}, Lddy;->a()Lddm;

    move-result-object v0

    iput-object v0, p0, Ldei;->b:Lddm;

    .line 2242
    const/4 v0, 0x0

    .line 777
    iput v0, p0, Ldei;->c:I

    .line 778
    return-void
.end method


# virtual methods
.method public final a()B
    .locals 1

    .prologue
    .line 789
    iget-object v0, p0, Ldei;->b:Lddm;

    invoke-interface {v0}, Lddm;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 790
    iget-object v0, p0, Ldei;->a:Ldeh;

    invoke-virtual {v0}, Ldeh;->a()Lddy;

    move-result-object v0

    invoke-virtual {v0}, Lddy;->a()Lddm;

    move-result-object v0

    iput-object v0, p0, Ldei;->b:Lddm;

    .line 792
    :cond_0
    iget v0, p0, Ldei;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ldei;->c:I

    .line 793
    iget-object v0, p0, Ldei;->b:Lddm;

    invoke-interface {v0}, Lddm;->a()B

    move-result v0

    return v0
.end method

.method public final hasNext()Z
    .locals 1

    .prologue
    .line 781
    iget v0, p0, Ldei;->c:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 768
    .line 2785
    invoke-virtual {p0}, Ldei;->a()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    .line 768
    return-object v0
.end method

.method public final remove()V
    .locals 1

    .prologue
    .line 797
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.class public final Ldeu;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 58
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ldeu;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a(Lder;Lder;)V
    .locals 1

    .prologue
    .line 336
    iget-object v0, p0, Lder;->i:Ldes;

    if-eqz v0, :cond_0

    .line 337
    iget-object v0, p0, Lder;->i:Ldes;

    invoke-virtual {v0}, Ldes;->a()Ldes;

    move-result-object v0

    iput-object v0, p1, Lder;->i:Ldes;

    .line 339
    :cond_0
    return-void
.end method

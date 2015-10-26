.class public final Lawi;
.super Lavr;
.source "PG"


# instance fields
.field final b:[B

.field final c:Lavv;

.field final d:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Lavv;[B)V
    .locals 1

    .prologue
    .line 15
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lavr;-><init>(I)V

    .line 16
    iput-object p1, p0, Lawi;->d:Ljava/util/UUID;

    .line 17
    iput-object p2, p0, Lawi;->c:Lavv;

    .line 18
    iput-object p3, p0, Lawi;->b:[B

    .line 19
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lawi;->c:Lavv;

    invoke-interface {v0}, Lavv;->a()V

    .line 51
    return-void
.end method

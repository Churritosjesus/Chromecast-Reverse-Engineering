.class public final Lawb;
.super Lavr;
.source "PG"


# instance fields
.field final b:Lawc;

.field final c:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Lawc;)V
    .locals 1

    .prologue
    .line 14
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lavr;-><init>(I)V

    .line 15
    iput-object p1, p0, Lawb;->c:Ljava/util/UUID;

    .line 16
    iput-object p2, p0, Lawb;->b:Lawc;

    .line 17
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lawb;->b:Lawc;

    invoke-interface {v0}, Lawc;->a()V

    .line 49
    return-void
.end method

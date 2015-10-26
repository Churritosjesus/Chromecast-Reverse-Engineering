.class public final Lawj;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Landroid/os/Handler;

.field final b:J

.field private final c:Lawi;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/util/UUID;[BJ)V
    .locals 2

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lawj;->a:Landroid/os/Handler;

    .line 27
    iput-wide p4, p0, Lawj;->b:J

    .line 28
    new-instance v0, Lawi;

    new-instance v1, Lawk;

    invoke-direct {v1, p0}, Lawk;-><init>(Lawj;)V

    invoke-direct {v0, p2, v1, p3}, Lawi;-><init>(Ljava/util/UUID;Lavv;[B)V

    iput-object v0, p0, Lawj;->c:Lawi;

    .line 41
    return-void
.end method


# virtual methods
.method public final a(Lauv;)V
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lawj;->c:Lawi;

    invoke-virtual {p1, v0}, Lauv;->a(Lavr;)V

    .line 45
    return-void
.end method

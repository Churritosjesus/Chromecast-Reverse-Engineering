.class final Lbej;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lapd;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:J

.field final synthetic d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic e:Lbfp;

.field final synthetic f:Lbff;

.field final synthetic g:Lbdu;


# direct methods
.method constructor <init>(Lbdu;Lapd;Ljava/lang/String;JLjava/util/concurrent/atomic/AtomicBoolean;Lbfp;Lbff;)V
    .locals 0

    .prologue
    .line 647
    iput-object p1, p0, Lbej;->g:Lbdu;

    iput-object p2, p0, Lbej;->a:Lapd;

    iput-object p3, p0, Lbej;->b:Ljava/lang/String;

    iput-wide p4, p0, Lbej;->c:J

    iput-object p6, p0, Lbej;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p7, p0, Lbej;->e:Lbfp;

    iput-object p8, p0, Lbej;->f:Lbff;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 650
    iget-object v0, p0, Lbej;->g:Lbdu;

    .line 1033
    iget-object v0, v0, Lbdu;->h:Lazv;

    .line 650
    iget-object v1, p0, Lbej;->g:Lbdu;

    .line 2033
    iget-object v1, v1, Lbdu;->f:Ljava/lang/String;

    .line 650
    new-instance v2, Lbek;

    invoke-direct {v2, p0}, Lbek;-><init>(Lbej;)V

    iget-object v3, p0, Lbej;->g:Lbdu;

    .line 3033
    iget-boolean v3, v3, Lbdu;->g:Z

    .line 650
    invoke-virtual {v0, v1, v2, v3}, Lazv;->a(Ljava/lang/String;Lbaa;Z)Z

    .line 687
    return-void
.end method

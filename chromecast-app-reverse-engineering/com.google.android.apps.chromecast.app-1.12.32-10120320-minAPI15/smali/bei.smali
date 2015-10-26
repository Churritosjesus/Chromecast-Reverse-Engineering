.class final Lbei;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbeh;


# direct methods
.method constructor <init>(Lbeh;)V
    .locals 0

    .prologue
    .line 596
    iput-object p1, p0, Lbei;->a:Lbeh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .prologue
    .line 601
    iget-object v0, p0, Lbei;->a:Lbeh;

    iget-wide v0, v0, Lbeh;->f:J

    const/4 v2, 0x1

    shl-long v7, v0, v2

    .line 602
    iget-object v0, p0, Lbei;->a:Lbeh;

    iget-object v0, v0, Lbeh;->h:Lbdu;

    iget-object v1, p0, Lbei;->a:Lbeh;

    iget-object v1, v1, Lbeh;->a:Ljava/lang/String;

    iget-object v2, p0, Lbei;->a:Lbeh;

    iget-wide v2, v2, Lbeh;->c:J

    iget-object v4, p0, Lbei;->a:Lbeh;

    iget-object v4, v4, Lbeh;->e:Lbfp;

    iget-object v5, p0, Lbei;->a:Lbeh;

    iget v5, v5, Lbeh;->g:I

    iget-object v6, p0, Lbei;->a:Lbeh;

    iget v6, v6, Lbeh;->d:I

    add-int/lit8 v6, v6, 0x1

    iget-object v9, p0, Lbei;->a:Lbeh;

    iget-object v9, v9, Lbeh;->b:Lbff;

    .line 1033
    invoke-virtual/range {v0 .. v9}, Lbdu;->a(Ljava/lang/String;JLbfp;IIJLbff;)V

    .line 604
    return-void
.end method

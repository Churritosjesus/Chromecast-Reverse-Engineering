.class final Laxs;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbcm;


# instance fields
.field private synthetic a:Laxr;


# direct methods
.method constructor <init>(Laxr;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Laxs;->a:Laxr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lbcd;)V
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Laxs;->a:Laxr;

    iget-object v0, v0, Laxr;->b:Laxq;

    .line 3039
    iget-object v0, v0, Laxq;->e:Lbcm;

    .line 103
    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Laxs;->a:Laxr;

    iget-object v0, v0, Laxr;->b:Laxq;

    .line 4039
    iget-object v0, v0, Laxq;->e:Lbcm;

    .line 104
    invoke-interface {v0, p1}, Lbcm;->a(Lbcd;)V

    .line 106
    :cond_0
    return-void
.end method

.method public final a(Lbcd;I)V
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Laxs;->a:Laxr;

    iget-object v0, v0, Laxr;->b:Laxq;

    .line 1039
    iget-object v0, v0, Laxq;->e:Lbcm;

    .line 96
    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Laxs;->a:Laxr;

    iget-object v0, v0, Laxr;->b:Laxq;

    .line 2039
    iget-object v0, v0, Laxq;->e:Lbcm;

    .line 97
    invoke-interface {v0, p1, p2}, Lbcm;->a(Lbcd;I)V

    .line 99
    :cond_0
    return-void
.end method

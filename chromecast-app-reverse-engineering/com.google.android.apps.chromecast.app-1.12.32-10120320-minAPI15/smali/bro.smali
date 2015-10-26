.class final Lbro;
.super Lbsb;


# instance fields
.field private synthetic d:Lbrn;


# direct methods
.method constructor <init>(Lbrn;Lbrb;)V
    .locals 0

    iput-object p1, p0, Lbro;->d:Lbrn;

    invoke-direct {p0, p2}, Lbsb;-><init>(Lbrb;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lbro;->d:Lbrn;

    .line 2000
    new-instance v1, Lbrr;

    invoke-direct {v1, v0}, Lbrr;-><init>(Lbrn;)V

    invoke-virtual {v0, v1}, Lbrn;->a(Lbsf;)V

    .line 0
    return-void
.end method

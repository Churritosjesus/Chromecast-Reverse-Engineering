.class final Lazh;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Lbdu;

.field private synthetic b:Lbdf;

.field private synthetic c:Lapd;

.field private synthetic d:Lbdn;

.field private synthetic e:Lazg;


# direct methods
.method constructor <init>(Lazg;Lbdu;Lbdf;Lapd;Lbdn;)V
    .locals 0

    .prologue
    .line 181
    iput-object p1, p0, Lazh;->e:Lazg;

    iput-object p2, p0, Lazh;->a:Lbdu;

    iput-object p3, p0, Lazh;->b:Lbdf;

    iput-object p4, p0, Lazh;->c:Lapd;

    iput-object p5, p0, Lazh;->d:Lbdn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 181
    move-object v3, p1

    check-cast v3, Lbdj;

    .line 1185
    iget-object v0, p0, Lazh;->e:Lazg;

    iget-object v1, p0, Lazh;->a:Lbdu;

    iget-object v2, p0, Lazh;->b:Lbdf;

    iget-object v4, p0, Lazh;->c:Lapd;

    iget-object v5, p0, Lazh;->d:Lbdn;

    .line 2022
    invoke-virtual/range {v0 .. v5}, Lazg;->a(Lbdu;Lbdf;Lbdj;Lapd;Lbdn;)V

    .line 181
    return-void
.end method

.method public final b_(I)V
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Lazh;->d:Lbdn;

    invoke-interface {v0, p1}, Lbdn;->b_(I)V

    .line 192
    return-void
.end method

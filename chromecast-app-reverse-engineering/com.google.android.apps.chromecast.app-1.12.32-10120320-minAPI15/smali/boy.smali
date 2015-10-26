.class final Lboy;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field private synthetic a:Lbos;


# direct methods
.method constructor <init>(Lbos;)V
    .locals 0

    .prologue
    .line 359
    iput-object p1, p0, Lboy;->a:Lbos;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .prologue
    .line 363
    iget-object v0, p0, Lboy;->a:Lbos;

    invoke-static {v0, p2}, Lbos;->a(Lbos;Z)V

    .line 364
    return-void
.end method

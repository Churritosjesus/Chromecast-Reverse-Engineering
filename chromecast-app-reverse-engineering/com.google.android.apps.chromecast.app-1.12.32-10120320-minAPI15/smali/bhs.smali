.class final Lbhs;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field private synthetic a:Lbhf;


# direct methods
.method constructor <init>(Lbhf;)V
    .locals 0

    .prologue
    .line 861
    iput-object p1, p0, Lbhs;->a:Lbhf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .prologue
    .line 864
    iget-object v0, p0, Lbhs;->a:Lbhf;

    invoke-static {v0, p2}, Lbhf;->d(Lbhf;Z)V

    .line 865
    return-void
.end method
